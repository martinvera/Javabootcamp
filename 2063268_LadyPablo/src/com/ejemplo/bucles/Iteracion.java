package com.ejemplo.bucles;

import java.util.List;

public class Iteracion {
    public static void main(String[] args) {
        // BUCLE FOR
        // i++ ---> i = i + 1;
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + i);
        }*/

        // BUCLE WHILE
        /*int i = 0;
        while (i < 10) {
            System.out.println("Numero: " + i);
            i++;
        }*/

        // BUCLE DO WHILE
        /*int i = 0;
        do {
            System.out.println("Numero: " + i);
            i++;
        } while (i < 10);*/

        List<String> listaFrutas = List.of("Manzana", "Pera", "Naranja", "Platano");

        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
    }
}
