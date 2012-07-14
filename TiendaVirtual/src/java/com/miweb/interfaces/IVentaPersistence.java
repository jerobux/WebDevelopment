/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Venta;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IVentaPersistence {

    public boolean insertarVenta(Venta venta);

    public Venta buscarVenta(int id);

    public List<Venta> listarVentas();
}
