package com.tarea.tarea3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Elaborar un programa en java que simule una calculadora para sumar, restar, dividir y calcular la potencias.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = numero1 * 1.0 / numero2;
        double potencia = Math.pow(numero1, numero2); //Match.pow calcula el numero1 elevado a la potencia del numero2

        System.out.println("LOS RESULTADOS SON:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Potencia: " + potencia);
    }

}