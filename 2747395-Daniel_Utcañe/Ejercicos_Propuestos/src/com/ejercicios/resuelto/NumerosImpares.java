package com.ejercicios.resuelto;

public class NumerosImpares {
    public static void main(String[] args) {
        int numero = 30;

        for (int i = 0; i <= numero; i++) {

            if (i % 2 != 0) {
                System.out.println("Numero impar: " + i);
            }
        }
    }
}
