package com.ejercicios.resuelto4;

import java.util.Scanner;

public class ConvertirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra u oración ");
        String palabra = scanner.nextLine();

        System.out.println("Ingrese su opción:\n 1: Convertir a Mayuscula\n 2: Convertir a Minuscula ");
        int op = scanner.nextInt();


       // String palabra = "Dios es Amor";
        String mayus="";
        String minus="";
        String vocales = "";

        if (op == 1) {

            mayus = palabra.toUpperCase();
            for (int i = 0; i < mayus.length(); i++) {
                if (mayus.charAt(i) == 'A' || mayus.charAt(i) == 'E' || mayus.charAt(i) == 'I' || mayus.charAt(i) == 'O' || mayus.charAt(i)== 'U' ) {
                     //   vocales += palabra.charAt(i);
                         vocales += mayus.charAt(i);
                }
            }
             System.out.println("palabra convertida: " + mayus);
             System.out.println("las vocales son: " + vocales);
        }
        if (op == 2) {

            minus = palabra.toLowerCase();
            for (int i = 0; i < minus.length(); i++) {
                if (minus.charAt(i) == 'a' || minus.charAt(i) == 'e' || minus.charAt(i) == 'i' || minus.charAt(i) == 'o' || minus.charAt(i)== 'u' ) {
                    //   vocales += palabra.charAt(i);
                    vocales += minus.charAt(i);
                }
            }
            System.out.println("palabra convertida: " + minus);
            System.out.println("las vocales son: " + vocales);
        }
    }
}
