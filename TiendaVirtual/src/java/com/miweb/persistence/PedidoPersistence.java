/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IPedidoPersistence;
import com.miweb.negocio.Pedido;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class PedidoPersistence implements IPedidoPersistence {

    @Override
    public boolean insertarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pedido buscarPedido(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pedido> listarPedidos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
