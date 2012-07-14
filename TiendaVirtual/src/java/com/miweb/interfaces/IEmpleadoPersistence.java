/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Empleado;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IEmpleadoPersistence {

    public boolean insertarEmpleado(Empleado empleado);

    public Empleado buscarEmpleado(int id);

    public boolean eliminarEmpleado(int id);

    public boolean actualizarEmpleado(Empleado empleado);

    public List<Empleado> listarEmpleados();
}
