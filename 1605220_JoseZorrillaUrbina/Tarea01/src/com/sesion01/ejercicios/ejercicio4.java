package com.sesion01.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un palabra o cadena de texto: ");
        String texto = scanner.nextLine();

        String textoUpperCase = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoUpperCase);

        System.out.print("Vocales encontradas: ");
        for (char caracter : texto.toCharArray()) {
            if (esVocal(caracter)) {
                System.out.print(caracter + " ");
            }
        }
        System.out.println();
    }

    // Método para verificar si un caracter es una vocal
    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
