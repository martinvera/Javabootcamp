package com.segunda.tarea.ejercicio4;

import java.util.Scanner;

//2018580 Cinthia Rojas
public class ConvertirTextoMayuscula {

    /*Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas
      a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra o cadena de texto
      y mostrarlo en pantalla*/

    public String palabra;
    public String convertirMayuscula;

    public ConvertirTextoMayuscula () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese una palabra: ");
        palabra = scanner.nextLine();

        }
        public void ConvertirTexto () {
            convertirMayuscula = palabra.toUpperCase();
            System.out.println("Texto convertido en mayuscula: " + convertirMayuscula);

        }

        public void ExtraerVocales () {
            StringBuilder vocales = new StringBuilder();
            for (char caracter : convertirMayuscula.toCharArray()) {

                if ("AEIOU".indexOf(caracter) != -1) {
                    vocales.append(caracter);

                }

            }
            System.out.println("Las vocales en el texto son: " + vocales.toString());

        }



}
