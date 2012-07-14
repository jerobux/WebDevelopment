/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IEmpleadoPersistence;
import com.miweb.negocio.Empleado;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class EmpleadoPersistence implements IEmpleadoPersistence{

    @Override
    public boolean insertarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Empleado buscarEmpleado(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarEmpleado(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Empleado> listarEmpleados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
