package com.jazorrilla.Rutinas;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class interfaceRetiro {
    private int tipoMoneda;
    private Double importeCuenta;
    private int tipoCambio;
    private String numeroEnLetras;

    ConvertirNumeroEnLetras convertirNumeroEnTexto = new ConvertirNumeroEnLetras();

    Scanner scanner = new Scanner(System.in);

    public interfaceRetiro(Double importeCuenta, int tipoCambio) {
        this.importeCuenta = importeCuenta;
        this.tipoCambio = tipoCambio;
    }

    public int obtenerTipoMoneda() {

        System.out.println("Por favor indique el tipo de moneda que desea realizar el retiro");
        System.out.println("    Ingrese 1 para Soles");
        System.out.println("    Ingrese 2 para US Dolares");
        tipoMoneda = scanner.nextInt();

        return tipoMoneda;
    }

    public void retirarSoles(Double importeCuenta) {
        Double importeSoles;
        Double importeSaldoSoles;
        Date current = new Date();

        System.out.println("Ingrese importe de Soles que desea retirar ");
        importeSoles = scanner.nextDouble();

        importeSaldoSoles = importeCuenta-importeSoles;

        if (importeSoles > 0 && importeSoles <= importeCuenta){
            numeroEnLetras = convertirNumeroEnTexto.convertidorNumeroALetras(importeSoles);
            System.out.println("Usted a realizado un retiro en Soles");
            System.out.println("    El importe solicitado es " + importeSoles + "(" + numeroEnLetras + ")");
            System.out.println("    Dejandose un saldo en la cuenta de " + importeSaldoSoles);
            System.out.println(current);
        }else{
            System.out.println("Usted no dispone del saldo suficiente para realizar el retiro");
        };
    }

    public void retirarDolares(Double importeCuenta, int tipoCambio) {
        Double importeSoles;
        Double importeDolares;
        Double importeSaldoSoles;
        Date current = new Date();

        System.out.println("Ingrese importe de Soles que desea retirar ");
        importeSoles = scanner.nextDouble();

        importeDolares    = importeSoles/tipoCambio;
        importeSaldoSoles = importeCuenta-importeSoles;

        if (importeSoles > 0 && importeSoles <= importeCuenta){
            numeroEnLetras = convertirNumeroEnTexto.convertidorNumeroALetras(importeSoles);

            System.out.println("Usted a realizado un retiro en US Dolares");
            System.out.println("    El importe solicitado es " + importeSoles + "(" + numeroEnLetras + ")");
            System.out.println("    con el tipo de cambio " + tipoCambio + " recibirá " + importeDolares + " US Dolares");
            System.out.println("    Dejandose un saldo en la cuenta de " + importeSaldoSoles);
            System.out.println(current);
        }else{
            System.out.println("Usted no dispone del saldo suficiente para realizar el retiro");
        };
    }

    public void retrasarAccion(int tiempoEspera){
        try {
            TimeUnit.SECONDS.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
