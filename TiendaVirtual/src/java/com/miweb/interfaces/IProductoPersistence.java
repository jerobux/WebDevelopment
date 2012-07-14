/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Producto;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IProductoPersistence {

    public boolean insertarProducto(Producto producto);

    public Producto buscarProducto(int id);

    public Producto buscarProductoNombre(String nombre);

    public Producto buscarProductoCateg(int idCategoria);

    public boolean eliminarProducto(int id);

    public boolean actualizarProducto(Producto p);

    public List<Producto> listarProductos();
}
