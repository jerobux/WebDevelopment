/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IClientePersistence;
import com.miweb.negocio.Cliente;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class ClientePersistence implements IClientePersistence {

    @Override
    public boolean insertarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente buscarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente buscarClienteDni(String dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente buscarClienteNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Cliente> listarClientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
