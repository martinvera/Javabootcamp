package com.sesion01.ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número del mes : ");
        int mes = scanner.nextInt();

        String estacion;

        switch (mes) {
            case 3, 4, 5: // Marzo, Abril y Mayo
                estacion = "Otoño";
                break;
            case 6, 7, 8: // Junio, Julio y Agosto
                estacion = "Invierno";
                break;
            case 9, 10, 11: // Setiembre, Octubre y Noviembre
                estacion = "Primavera";
                break;
            case 12, 1, 2: // Diciembre, Enero y Febrero
                estacion = "Verano";
                break;
            default:
                estacion = "Mes inválido";
        }

        System.out.println("El mes " + mes + " corresponde a la estación: " + estacion);
    }
}
