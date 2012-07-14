/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.negocio;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Usuario implements Serializable
{
    private Persona persona;
    private String username;
    private String pass;

    public Usuario(String idUsuario, String pass) {
        this.username = idUsuario;
        this.pass = pass;
    }

    public Usuario() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
