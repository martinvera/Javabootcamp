package com.sesion01.ejercicios;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ejercicio6 {
    public static void main(String[] args) {
        boolean esPrimo = true;
        int i, numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();

        for( i = 2; i < sqrt(numero); i++){
            if(numero % i == 0){
                esPrimo = false;
                break;
            }
        }

        if(esPrimo){
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }
}
