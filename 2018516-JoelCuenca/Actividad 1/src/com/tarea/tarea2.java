package com.tarea;

import java.util.Scanner;

public class tarea2 {

    /*2. Elaborar un programa en java que permita mostrar las estaciones del año
    (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el mes a consultar:");
        String mes1 = scanner.nextLine();

        String mes = mes1.toUpperCase();
        switch (mes){
            case "DICIEMBRE", "ENERO", "FEBRERO" :
                System.out.println("PARA EL MES DE " + mes + " LA ESTACION ES VERANO");
                break;

            case  "MARZO", "ABRIL", "MAYO" :
                System.out.println("PARA EL MES DE " + mes + " LA ESTACION ES OTOÑO");
                break;

            case "JUNIO", "JULIO", "AGOSTO" :
                System.out.println("PARA EL MES DE " + mes + " LA ESTACION ES INVIERNO");
                break;

            case "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE" :
                System.out.println("PARA EL MES DE " + mes + " LA ESTACION ES PRIMAVERA");
                break;

            default:
                System.out.println("EL MES INGRESADO ES INVALIDO");
        }
    }
}
