package com.tarea;

import java.util.Scanner;

public class ConvertirYExtraerVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o cadena de texto: ");
        String texto = scanner.nextLine();

        // Convertir a mayúsculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + textoMayusculas);

        // Extraer vocales
        StringBuilder vocales = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vocales.append(c);
            }
        }

        System.out.println("Vocales extraídas: " + vocales.toString());

        scanner.close();
    }
}
