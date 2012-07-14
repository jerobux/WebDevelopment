/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.services;

import com.miweb.interfaces.IPersonaPersistence;
import com.miweb.negocio.Persona;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class PersonaService {

    protected IPersonaPersistence personaPersistencia;

    public boolean Grabar(Persona persona) {
        return personaPersistencia.insertarPersona(persona);
    }

    public Persona TraerPersona(int id) {
        return personaPersistencia.buscarPersona(id);
    }

    public List<Persona> TraerListaPersonas() {
        return personaPersistencia.listarPersonas();
    }

    /**
     * @param persistencia the persistencia to set
     */
    public void setPersonaPersistencia(IPersonaPersistence personaPersistencia) {
        this.personaPersistencia = personaPersistencia;
    }
}
