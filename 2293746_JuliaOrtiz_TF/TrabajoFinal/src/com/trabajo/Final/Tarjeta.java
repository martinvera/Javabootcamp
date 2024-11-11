package com.trabajo.Final;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tarjeta {
    double saldo = 55_00.88;
    double kantidad;
    double varcantidad;
    public static final double TIPO_CAMBIO = 4;
    public String words;
    public String valmoneda;
    public String decimalPartString;

    public int respuesta1 = 1;
    public int respuesta2 = 1;
    public int respuesta3 = 1;

    NumberToWords Numerostexto = new NumberToWords();

    void sacarEfectivo(int moneda, double cantidad) {
        varcantidad = cantidad;
        if (cantidad < 0) {
            return;
        }

        switch (moneda) {
            case 1:
                if (cantidad > saldo) {
                    respuesta3 = 0;
                    break;
                }
                kantidad = cantidad;
                valmoneda = String.valueOf(TipoDeMoneda.Soles);
                saldo -= cantidad;
                break;
            case 2:
                if (cantidad * TIPO_CAMBIO > saldo) {
                    respuesta3 = 0;
                    break;
                }
                kantidad = (cantidad * TIPO_CAMBIO);
                valmoneda = String.valueOf(TipoDeMoneda.Dolares);
                saldo -= cantidad * TIPO_CAMBIO;
                break;
        }
    }

    double obtenerSaldo() {
        return saldo;
    }


    // validar longitud tarjeta
    public void validarLongitud(String numTarjeta) {
        int longitud = numTarjeta.length();
        if (longitud == 16) {
        } else {
            respuesta1 = 0; //"Error en el numero de Tarjeta, bye";
        }
    }

    // validar tipo Moneda
    void validarMoneda(int tipoMoneda) {
        if (tipoMoneda == 1 || tipoMoneda == 2) {
        } else {
            respuesta2 = 0;
        }
    }


    void textoRetiro(double kantidad) {
        int integerPart = (int) kantidad;
        // Obtener la parte decimal
        double decimalPart = kantidad - integerPart;
        BigDecimal bd = new BigDecimal(decimalPart);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedDecimalPart = bd.doubleValue();
//
//        // Convertir la parte decimal a string y quitar el "0."
        //decimalPartString = String.valueOf(roundedDecimalPart).substring(2);
        DecimalFormat df = new DecimalFormat("0.00");
        decimalPartString = df.format(roundedDecimalPart).substring(2);

        words = Numerostexto.convert(integerPart);
    }
}