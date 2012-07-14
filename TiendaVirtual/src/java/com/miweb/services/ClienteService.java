/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.services;

import com.miweb.interfaces.IClientePersistence;
import com.miweb.negocio.Cliente;
import com.miweb.negocio.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class ClienteService extends PersonaService {

    public List<String> errores;
    private IClientePersistence clientePersistence;

    public boolean Grabar(Cliente cliente) {
        boolean result = false;
        try {
            if (super.Grabar(cliente.getPersona())) {
                result = clientePersistence.insertarCliente(cliente);
            }

        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return result;
    }

    public Cliente TraerCiente(int id) {
        Cliente cliente = new Cliente();
        try {
            cliente = clientePersistence.buscarCliente(id);
            if (cliente != null) {
                Persona persona = cliente.getPersona();
                persona = super.TraerPersona(persona.getIdPersona());
                cliente.setPersona(persona);
            }
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return cliente;
    }

    public List<Cliente> TraerListaClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            clientes = clientePersistence.listarClientes();
            if (clientes.size() > 0) {
                for (Cliente cliente : clientes) {
                    Persona persona = cliente.getPersona();
                    persona = super.TraerPersona(persona.getIdPersona());
                    cliente.setPersona(persona);
                }
            }
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return clientes;
    }

    /**
     * @return the clientePersistence
     */
    public IClientePersistence getClientePersistence() {
        return clientePersistence;
    }

    /**
     * @param clientePersistence the clientePersistence to set
     */
    public void setClientePersistence(IClientePersistence clientePersistence) {
        this.clientePersistence = clientePersistence;
    }
}
