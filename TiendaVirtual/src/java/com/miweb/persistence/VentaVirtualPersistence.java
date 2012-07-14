/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IVentaVirtualPersistence;
import com.miweb.negocio.VentaVirtual;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class VentaVirtualPersistence implements IVentaVirtualPersistence {

    @Override
    public boolean insertarVenta(VentaVirtual ventaVirtual) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public VentaVirtual buscarVentaVirtual(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<VentaVirtual> listarVentasVirtuales() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
