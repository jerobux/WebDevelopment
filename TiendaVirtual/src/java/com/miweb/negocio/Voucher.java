/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.negocio;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC
 */
@ManagedBean(name = "Voucher")
@ViewScoped
public class Voucher implements Serializable
{
    private int idVoucher;
    private String banco;
    private double monto;

    public Voucher() {
    }

    public Voucher(int nro, String banco, double monto) {
        this.idVoucher = nro;
        this.banco = banco;
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }
    
    
    
}
