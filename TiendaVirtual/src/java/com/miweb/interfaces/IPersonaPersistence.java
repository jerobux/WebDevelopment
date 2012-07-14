/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Persona;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IPersonaPersistence {

    public boolean insertarPersona(Persona persona);

    public Persona buscarPersona(int id);

    public Persona buscarPersonaDNI(String dni);

    public boolean eliminarPersona(int id);

    public boolean eliminarPersonaDNI(String dni);

    public boolean actualizarPersona(Persona persona);

    public List<Persona> listarPersonas();
}
