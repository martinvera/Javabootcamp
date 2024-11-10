package com.lafajardo.modelo;

import java.math.BigDecimal;

// Clase para el saldo, se protege la variable con encapsulación
public class Cuenta {
    private BigDecimal saldo;

    public Cuenta(BigDecimal saldoInicial) {
        this.saldo = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public boolean retirar(BigDecimal monto) {
        if (monto.compareTo(saldo) > 0) {
            return false;
        }
        saldo = saldo.subtract(monto);
        return true;
    }
}