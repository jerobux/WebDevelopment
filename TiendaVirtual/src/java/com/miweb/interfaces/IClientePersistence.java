/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Cliente;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IClientePersistence {

    public boolean insertarCliente(Cliente cliente);

    public Cliente buscarCliente(int id);

    public Cliente buscarClienteDni(String dni);

    public Cliente buscarClienteNombre(String nombre);

    public boolean eliminarCliente(int id);

    public boolean actualizarCliente(Cliente c);

    public List<Cliente> listarClientes();
}
