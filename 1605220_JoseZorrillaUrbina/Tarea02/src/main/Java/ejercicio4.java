/*
4. Elaborar un programa en java que permita convertir un palabra o cadena de texto
   de minúsculas a mayúsculas y que extraiga las vocales que se identifique dentro
   de la palabra o cadena de texto y mostrarlo en pantalla.
 */

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

    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
