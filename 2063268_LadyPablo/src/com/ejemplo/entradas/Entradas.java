package com.ejemplo.entradas;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Bienvenido " + nombre + " " + apellido + ", edad " + edad);
    }
}
