/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

/**
 *
 * @author Jesus
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "Login")
@RequestScoped
public class Login {

    private String username;
    private String password;

    public void onLogin(ActionEvent e) {
        if (!username.equalsIgnoreCase("dukes") && !username.equalsIgnoreCase("admin")) {
            throw new AbortProcessingException("Usuario invalido");
        }
// password=null;
    }

    public String submit() {
        String salida = "none";
        if (username.equalsIgnoreCase("dukes")) {
            salida = "success";
        } else {
            salida = "admin";
        }
        System.out.println(salida);
        return salida;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
