package com.tarea;

import java.util.Scanner;

public class Tarea3 {

    /*3. Elaborar un programa en java que simule una calculadora para sumar, restar,
    dividir y calcular la potencias.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 1er valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese 2do valor: ");
        int valor2 = scanner.nextInt();

        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        double  division = (valor1 * 1.0) / valor2;
        double potencia = Math.pow(valor1,valor2);

        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Division = " + division);
        System.out.println("Potencia = " + potencia);

    }
}
