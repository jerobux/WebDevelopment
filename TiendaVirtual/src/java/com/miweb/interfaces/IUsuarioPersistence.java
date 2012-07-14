/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Usuario;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IUsuarioPersistence {

    public boolean insertarUsuario(Usuario u);

    public Usuario buscarUsuario(String username);

    public boolean eliminarUsuario(String username);

    public boolean actualizarUsuario(Usuario usuario);

    public List<Usuario> listarUsuarios();
}
