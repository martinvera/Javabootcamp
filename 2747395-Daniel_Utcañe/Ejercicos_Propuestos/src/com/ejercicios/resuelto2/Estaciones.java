package com.ejercicios.resuelto2;

import java.util.Scanner;

public class Estaciones {

    public static void main(String[] args) {
        /*
    Otoño : 20 Marzo - 19 Junio
    Invierno: 20 Junio - 21 Setiembre
    Primavera: 22 setiembre -  20 Diciembre
    verano: 21 diciembre - 19 Marzo
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Mes : ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el Dia : ");
        int dia = scanner.nextInt();

        String resultado = "";

        resultado = switch (mes) {
            case 1 -> "Verano";
            case 2 -> "verano";
            case 3 -> (dia < 20) ? "verano" : "otoño";
            case 4 -> "Otoño";
            case 5 -> "Otoño";
            case 6 -> (dia < 20) ? "Otoño" : "invierno";
            case 7 -> "invierno";
            case 8 -> "invierno";
            case 9 -> (dia < 22) ? "invierno" : "Primavera";
            case 10 -> "Primavera";
            case 11 -> "Primavera";
            case 12 -> (dia < 21) ? "Primavera" : "verano";
            default -> "Dato Erroneo";
        };
        System.out.println("la estación del año es: " + resultado);


    }


}
