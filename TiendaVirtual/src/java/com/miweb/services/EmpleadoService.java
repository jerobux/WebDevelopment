/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.services;

import com.miweb.interfaces.IEmpleadoPersistence;
import com.miweb.negocio.Empleado;
import com.miweb.negocio.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class EmpleadoService extends PersonaService {

    public List<String> errores;
    private IEmpleadoPersistence empleadoPersistence;

    public boolean Grabar(Empleado empleado) {
        boolean result = false;
        try {
            if (super.Grabar(empleado.getPersona())) {
                result = empleadoPersistence.insertarEmpleado(empleado);
            }

        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return result;
    }

    public Empleado TraerEmpleado(int id) {
        Empleado empleado = new Empleado();
        try {
            empleado = empleadoPersistence.buscarEmpleado(id);
            if (empleado != null) {
                Persona persona = empleado.getPersona();
                persona = super.TraerPersona(persona.getIdPersona());
                empleado.setPersona(persona);
            }
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return empleado;
    }

    public List<Empleado> TraerListaClientes() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        try {
            empleados = empleadoPersistence.listarEmpleados();
            if (empleados.size() > 0) {
                for (Empleado empleado : empleados) {
                    Persona persona = empleado.getPersona();
                    persona = super.TraerPersona(persona.getIdPersona());
                    empleado.setPersona(persona);
                }
            }
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return empleados;
    }

    /**
     * @return the clientePersistence
     */
    public IEmpleadoPersistence getClientePersistence() {
        return empleadoPersistence;
    }

    /**
     * @param clientePersistence the clientePersistence to set
     */
    public void setClientePersistence(IEmpleadoPersistence clientePersistence) {
        this.empleadoPersistence = clientePersistence;
    }
}
