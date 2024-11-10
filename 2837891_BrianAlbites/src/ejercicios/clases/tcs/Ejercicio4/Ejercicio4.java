package ejercicios.clases.tcs.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        convertorPalabras convertorPalabras = new convertorPalabras();

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        convertorPalabras.mayusculaExtractor(palabra);
    }
}
