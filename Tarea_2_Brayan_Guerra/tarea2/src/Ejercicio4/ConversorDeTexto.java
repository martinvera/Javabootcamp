package Ejercicio4;

import java.util.Scanner;

public class ConversorDeTexto {
//Elaborar un programa en java que permita convertir un palabra o cadena
    // de texto en minúsculas a mayúsculas y que extraiga las vocales que se
    // identifique dentro de la palabra o cadena de texto y mostrarlo en pantalla.

    //Metodo
    public void palabra(){
        Scanner input = new Scanner(System.in);
        String frase;
        String fraseEnMayuscula;
        System.out.println("Ingrese una palabra:");
        frase = input.nextLine();//guarda la linea ingresada
        fraseEnMayuscula = frase.toUpperCase();
        String impresionSinVocales;
        impresionSinVocales = fraseEnMayuscula.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("La palabra o frase es: " + impresionSinVocales);
    }
}
