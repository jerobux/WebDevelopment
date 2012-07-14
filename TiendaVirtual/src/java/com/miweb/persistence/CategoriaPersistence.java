/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.ICategoriaPersistence;
import com.miweb.negocio.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class CategoriaPersistence implements ICategoriaPersistence {

    public boolean insertarCategoria(Categoria cat) throws SQLException {
        int result;
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO Categoria (descripcion) VALUES (?)");
        ps.setString(1, cat.getDescripcion());
        result = ps.executeUpdate();
        cnn.close();
        ps.close();
        return result == 1;
    }

    public Categoria buscarCategoria(int id) throws SQLException {
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;
        Categoria cat = null;
        ps = cnn.prepareStatement("select * from CATEGORIA where idCategoria=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            cat = new Categoria() {
            };
            cat.setIdcategoria(id);
            cat.setDescripcion(rs.getString("descripcion"));
        }
        cnn.close();
        ps.close();
        return cat;
    }

    public Categoria buscarCategoriaNombre(String descripcion) throws SQLException {
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;
        Categoria cat = null;
        ps = cnn.prepareStatement("select * from CATEGORIA where descripcion=?");
        ps.setString(1, descripcion);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            cat = new Categoria() {
            };
            cat.setDescripcion(descripcion);
            cat.setIdcategoria(rs.getInt("idCategoria"));
        }
        cnn.close();
        ps.close();
        return cat;
    }

    public boolean eliminarCategoria(int id) throws SQLException {
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("delete from CATEGORIA where idCategoria=?");
        ps.setInt(1, id);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        return (rowsUpdated > 1);
    }

    public boolean actualizarCategoria(Categoria categoria) throws SQLException {
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE CATEGORIA SET nombre=? WHERE codcateg=" + categoria.getIdcategoria());
        ps.setString(1, categoria.getDescripcion());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        return (rowsUpdated > 1);
    }

    public List<Categoria> ListarCategorias() throws SQLException {
        Connection cnn = Configuration.getConnection();
        PreparedStatement ps = null;
        List<Categoria> lista = new ArrayList<Categoria>();

        ps = cnn.prepareStatement("SELECT * FROM CATEGORIA");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setIdcategoria(rs.getInt("idCategoria"));
            categoria.setDescripcion(rs.getString("descripcion"));
            lista.add(categoria);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
