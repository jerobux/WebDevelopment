/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IDetallePedidoPersistence;
import com.miweb.negocio.DetallePedido;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class DetallePedidoPersistence implements IDetallePedidoPersistence {

    @Override
    public boolean insertarDetallePedido(DetallePedido detallePedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarDetallePedido(int idPedido, int idProducto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetallePedido> listarDetallesPedido(int idPedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
