/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.interfaces;

import com.miweb.negocio.Voucher;
import java.util.List;

/**
 *
 * @author Jesus
 */
public interface IVoucherPersistence {

    public boolean insertarVoucher(Voucher ventaVirtual);

    public Voucher buscarVoucher(int id);

    public List<Voucher> listarVouchers();

    public List<Voucher> listarVouchersPorBanco();
}
