/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Categoria;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface ICategoriaPersistence {

    public boolean insertarCategoria(Categoria categoria)throws SQLException;

    public Categoria buscarCategoria(int id)throws SQLException;

    public Categoria buscarCategoriaNombre(String descripcion)throws SQLException;

    public boolean eliminarCategoria(int id)throws SQLException;

    public boolean actualizarCategoria(Categoria categoria)throws SQLException;

    public List<Categoria> ListarCategorias()throws SQLException;
}
