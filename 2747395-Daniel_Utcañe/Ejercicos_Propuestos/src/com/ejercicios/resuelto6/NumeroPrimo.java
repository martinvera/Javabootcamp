package com.ejercicios.resuelto6;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su numero para validar ");
        int numPri = sc.nextInt();

        int contador = 0;
        int aux;

        for (int i = 1; i <= numPri; i++) {
            aux = numPri % i;
            if (aux == 0) {
                contador +=  1;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero " + numPri + " es Primo");
        }
        else {
            System.out.println("El numero " + numPri + " no es primo");
        }

    }
}
