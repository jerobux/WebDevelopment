/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author PC
 */
public final class Configuration 
{
    
    
    public static Connection getConnection()
    {
        Context ctx;
        Connection cn=null;
        try {
            ctx = new InitialContext();
            DataSource ds;
            ds = (DataSource) ctx.lookup("jdbc/_tienda");                
            cn = ds.getConnection();
        } catch (NamingException e) {
        } catch (SQLException e) {
        }
        return cn;
    }
    
    
}
