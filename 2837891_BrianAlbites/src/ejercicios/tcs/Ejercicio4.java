package ejercicios.tcs;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra cualquiera: ");
        String palabra = scanner.nextLine();

        // Convertir a mayúsculas y mostrar
        String palabraMayusculas = palabra.toUpperCase();
        System.out.println("Palabra en mayúsculas: " + palabraMayusculas);

        // Extraer y mostrar vocales
        StringBuilder vocales = new StringBuilder();
        for (char letra : palabra.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                vocales.append(letra);
            }
        }
        System.out.println("Vocales encontradas: " + vocales.toString());
    }
}
