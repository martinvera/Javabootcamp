package com.lafajardo.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Clase para conversión de moneda

public class ConversorMoneda {

    public BigDecimal convertir(BigDecimal monto, BigDecimal tipoCambio) {
        return monto.multiply(tipoCambio).setScale(2, RoundingMode.HALF_UP);
    }
}