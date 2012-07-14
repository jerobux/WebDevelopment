/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IPersonaPersistence;
import com.miweb.negocio.Persona;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class PersonaPersistence implements IPersonaPersistence{

    @Override
    public boolean insertarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona buscarPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona buscarPersonaDNI(String dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarPersonaDNI(String dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Persona> listarPersonas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
