package OperacionSaldo;

import ValidacionTarjeta.ValidacionTarjeta;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class OperacionSaldo {
    public static final BigDecimal saldoinicial = new BigDecimal("5500.88");
    public static final BigDecimal tipocambio = new BigDecimal("4.00");
    private BigDecimal saldo;

    public OperacionSaldo(ValidacionTarjeta tarjeta) {
        this.saldo = saldoinicial;
    }

    public boolean validarmonto(BigDecimal valor) {
        // return valor > 0 && valor <= saldo;
        return valor.compareTo(BigDecimal.ZERO) > 0 && valor.compareTo(saldo) <= 0;
    }

    public void restarsaldo(BigDecimal valor) {
       // saldo -= valor;
        saldo = saldo.subtract(valor);
    }

    public void mostrarsaldo() {
        System.out.println("Su saldo actualmente es: " + OperacionSaldo.formatomoneda(saldo) + " soles");
    }

    public static String formatomoneda(BigDecimal valor) {
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        return df.format(valor);
    }

}
