/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.negocio;

/**
 *
 * @author Jesus
 */
public class VentaVirtual {
    private int idVentaVirtual;
    private Voucher voucher;
    private Pedido pedido;
    private int estado;

    /**
     * @return the idVentaVirtual
     */
    public int getIdVentaVirtual() {
        return idVentaVirtual;
    }

    /**
     * @param idVentaVirtual the idVentaVirtual to set
     */
    public void setIdVentaVirtual(int idVentaVirtual) {
        this.idVentaVirtual = idVentaVirtual;
    }

    /**
     * @return the voucher
     */
    public Voucher getVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
