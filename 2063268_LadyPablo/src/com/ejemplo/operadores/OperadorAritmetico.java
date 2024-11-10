package com.ejemplo.operadores;

public class OperadorAritmetico {
    public static void main(String[] args) {
        // Operadores Aritmeticas
        /*
        Comentario de varias lineas
        Este es otra linea
         */
        int numero1 = 10;
        int numero2 = 4;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (numero1 * 1.0) / numero2;
        int residuo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);
    }
}
