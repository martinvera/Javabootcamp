package Conversion;

import java.math.BigDecimal;

public class Conversion {

    private BigDecimal valor;
    private String moneda;

    public Conversion(BigDecimal valor, String moneda) {
        this.valor = valor;
        this.moneda = moneda;
    }

    public String Conversionaletras() {
        BigDecimal montoentero = valor.setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal montodecimal = valor.subtract(montoentero);

        String valorenletras = convertirnumero(montoentero.intValue());

        if (montodecimal.compareTo(BigDecimal.ZERO) > 0) {
            valorenletras += " "+ moneda+ " con " + montodecimal.multiply(new BigDecimal(100)).intValue() + " centimos ";
        }

        return valorenletras + " " + moneda;

    }


    private String convertirnumero(int numero) {
        if (numero == 0) return "cero";

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};

        String letras = "";

        if (numero >= 1000) {
            int miles = numero / 1000;
            letras += (miles == 1 ? "mil " : convertirnumero(miles) + " mil ");
            numero %= 1000;
        }

        if (numero >= 100) {
            int centena = numero / 100;
            letras += centenas[centena] + " ";
            numero %= 100;
        }

        if (numero >= 20) {
            int decena = numero / 10;
            letras += decenas[decena] + " ";
            numero %= 10;
        }

        if (numero > 0 && numero < 10) {
            letras += unidades[numero] + " ";
        } else if (numero >= 10 && numero < 20) {
            letras += especiales[numero - 10] + " ";
        }

        return letras.trim();

    }

}
