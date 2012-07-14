/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IUsuarioPersistence;
import com.miweb.negocio.Usuario;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class UsuarioPersistence implements IUsuarioPersistence
{

    @Override
    public boolean insertarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario buscarUsuario(String username) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminarUsuario(String username) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuario> listarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
      
    
}
