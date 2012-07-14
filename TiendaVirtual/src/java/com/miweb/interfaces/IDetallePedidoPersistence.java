/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.DetallePedido;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IDetallePedidoPersistence {

    public boolean insertarDetallePedido(DetallePedido detallePedido);

    public boolean eliminarDetallePedido(int idPedido, int idProducto);

    public List<DetallePedido> listarDetallesPedido(int idPedido);
}
