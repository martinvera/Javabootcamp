package com.tarea;

import java.util.Scanner;

public class EstacionesDelAno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un mes (1-12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1: // Enero
            case 2: // Febrero
            case 12: // Diciembre
                System.out.println("Estación: Invierno");
                break;
            case 3: // Marzo
            case 4: // Abril
            case 5: // Mayo
                System.out.println("Estación: Primavera");
                break;
            case 6: // Junio
            case 7: // Julio
            case 8: // Agosto
                System.out.println("Estación: Verano");
                break;
            case 9: // Septiembre
            case 10: // Octubre
            case 11: // Noviembre
                System.out.println("Estación: Otoño");
                break;
            default:
                System.out.println("Mes inválido. Por favor, ingrese un número del 1 al 12.");
                break;
        }

        scanner.close();
    }
}
