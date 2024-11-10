package com.examenFinal;

public class NumeroALetras {
    private static final String[] UNIDADES = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    private static final String[] DECENAS = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
    private static final String[] CENTENAS = { "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos" };

    public static String convertir(int numero) {
        if (numero == 0) {
            return "cero";
        }
        if (numero >= 1000) {
            int miles = numero / 1000;
            int resto = numero % 1000;
            return (miles > 1 ? convertir(miles) + " mil" : "mil") + (resto > 0 ? " " + convertir(resto) : "");
        }
        if (numero >= 100) {
            int centenas = numero / 100;
            int resto = numero % 100;
            return CENTENAS[centenas] + (resto > 0 ? " " + convertir(resto) : "");
        }
        if (numero >= 10) {
            int decenas = numero / 10;
            int unidades = numero % 10;
            return DECENAS[decenas] + (unidades > 0 ? " y " + UNIDADES[unidades] : "");
        }
        return UNIDADES[numero];
    }
}
