/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.negocio;

import java.io.Serializable;

/**
 *
 * @author Jesus
 */
public class Empleado implements Serializable{
    private int idEmpleado;
    private Persona persona;

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
