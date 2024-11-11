package com.tarea.tarea4;

import java.util.Locale;
import java.util.Scanner;

public class ExtraerVocales {
    public static void main(String[] args) {
        /*Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas
        a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra o cadena de texto
        y mostrarlo en pantalla*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese una palabra: ");
        String palabra = scanner.nextLine();

        String mayuscula = palabra.toUpperCase();
        System.out.println("Texto convertido en mayuscula: " + mayuscula);

        // Extraer vocales
        StringBuilder vocales = new StringBuilder(); //se utiliza para construir cadenas de caracteres de manera eficiente.
        for (char caracter : mayuscula.toCharArray()) { //El método toCharArray() convierte la cadena en un arreglo de caracteres.
            /*El método indexOf(c) busca el carácter c en la cadena "AEIOU".
            Si el carácter se encuentra en la cadena, indexOf(c) devuelve su posición
            (un valor mayor o igual a 0). Si no se encuentra, devuelve -1.
            Por lo tanto, != -1 significa que el carácter c es una vocal. */
            if ("AEIOU".indexOf(caracter) != -1) {
                vocales.append(caracter); //El  metodo append es una cadena de caracteres al final de otra cadena de caracteres que ya está en el StringBuilder.
            }
        }

        //toString() se usa para convertir el objeto StringBuilder en una cadena de texto (String).
        System.out.println("Las vocales en el texto son: " + vocales.toString());
    }
}

