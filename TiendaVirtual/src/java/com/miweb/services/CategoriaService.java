/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.services;

import com.miweb.interfaces.ICategoriaPersistence;
import com.miweb.negocio.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class CategoriaService {

    protected ICategoriaPersistence categoriaPersistencia;
    public List<String> errores;

    public boolean Grabar(Categoria categoria) {
        boolean result = false;
        try {
            result = categoriaPersistencia.insertarCategoria(categoria);
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return result;
    }

    public Categoria TraerCategoria(int id) {
        Categoria categoria = new Categoria();
        try {
            categoria = categoriaPersistencia.buscarCategoria(id);
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return categoria;
    }

    public List<Categoria> TraerListaCategorias() {
        List<Categoria> categorias = new ArrayList<Categoria>();
        try {
            categorias = categoriaPersistencia.ListarCategorias();
        } catch (Exception ex) {
            this.errores.add(ex.getMessage());
        }
        return categorias;
    }

    /**
     * @param persistencia the persistencia to set
     */
    public void setPersonaPersistencia(ICategoriaPersistence personaPersistencia) {
        this.categoriaPersistencia = personaPersistencia;
    }
}
