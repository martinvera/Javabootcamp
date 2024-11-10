package com.tarea;

import java.util.Scanner;

public class Tarea4 {

   /* 4. Elaborar un programa en java que permita convertir un palabra o cadena de texto en
   minúsculas a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra
   o cadena de texto y mostrarlo en pantalla*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto");
        String texto = scanner.nextLine();

        String mayuscula = texto.toUpperCase();

        System.out.println("Texto en Mayusula: " +mayuscula);

        char vocal;

        for (int i = 0; i < mayuscula.length(); i++){
            vocal = mayuscula.charAt(i);
          if(vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U'){

             System.out.println("Las vocal extraida es : " + vocal);
          }
        }

    }
}
