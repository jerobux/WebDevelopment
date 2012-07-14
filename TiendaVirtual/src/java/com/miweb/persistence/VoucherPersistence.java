/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.persistence;

import com.miweb.interfaces.IVoucherPersistence;
import com.miweb.negocio.Voucher;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class VoucherPersistence implements IVoucherPersistence {

    @Override
    public boolean insertarVoucher(Voucher ventaVirtual) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Voucher buscarVoucher(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Voucher> listarVouchers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Voucher> listarVouchersPorBanco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
