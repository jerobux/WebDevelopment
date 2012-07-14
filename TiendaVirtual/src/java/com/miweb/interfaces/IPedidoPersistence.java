/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Pedido;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IPedidoPersistence {

    public boolean insertarPedido(Pedido pedido);

    public Pedido buscarPedido(int id);

    public List<Pedido> listarPedidos();
}
