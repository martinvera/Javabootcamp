// Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas a mayúsculas y
// que extraiga las vocales que se identifique dentro de la palabra o cadena de texto y mostrarlo en pantalla.

import  java.util.Scanner;

public class Tarea_Convertir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar palabra o cadena de texto en miniscula" );
        String texto = scanner.nextLine().toUpperCase();
        System.out.println("Texto en MAYUSCULAS: " + texto);

        System.out.println("Vocales: ");
        for (char c :  texto.toCharArray()) {
            if ("AEIOU".indexOf(c) >=0 ) {
                System.out.println(c + " ");
            }
        }
    }

}