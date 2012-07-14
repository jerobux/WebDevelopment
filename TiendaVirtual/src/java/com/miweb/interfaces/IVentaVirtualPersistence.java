/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.VentaVirtual;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IVentaVirtualPersistence {

    public boolean insertarVenta(VentaVirtual ventaVirtual);

    public VentaVirtual buscarVentaVirtual(int id);

    public List<VentaVirtual> listarVentasVirtuales();
}
