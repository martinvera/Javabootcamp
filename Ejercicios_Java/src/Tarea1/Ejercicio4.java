package Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra o cadena de texto y mostrarlo en pantalla.

        System.out.print("Ingrese una palabra: ");
        String texto = scanner.next();

        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);

        // Extraer las vocales
        String vocales = extraerVocales(textoMayusculas);
        System.out.println("Vocales encontradas: " + vocales);
    }

    public static String extraerVocales(String texto) {
        StringBuilder vocales = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (esVocal(c)) {
                vocales.append(c);
            }
        }
        return vocales.toString();
    }

    public static boolean esVocal(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
