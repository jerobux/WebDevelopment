/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IProductoPersistence;
import com.miweb.negocio.Producto;
import java.util.List;

/**
 *
 * @author Igor
 */
public class ProductoPersistence implements IProductoPersistence{

    @Override
    public boolean insertarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Producto buscarProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Producto buscarProductoNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Producto buscarProductoCateg(int idCategoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarProducto(Producto p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Producto> listarProductos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
