package com.ejercios.metodo4;

import java.util.Scanner;

public class Interfas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra u oración ");
        String palabra = scanner.nextLine();

        System.out.println("Ingrese su opción:\n 1: Convertir a Mayuscula\n 2: Convertir a Minuscula ");
        int op = scanner.nextInt();

        Convertir convertir = new Convertir(op, palabra);

        convertir.operacion();
    }
}
