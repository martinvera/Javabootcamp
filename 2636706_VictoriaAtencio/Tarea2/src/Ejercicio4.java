import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita convertir un palabra o cadena de texto en
        // minúsculas a mayúsculas y que extraiga las vocales que se
        // identifique dentro de la palabra o cadena de texto y mostrarlo en pantalla.

        //Solicita ingrese un una palabra
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        String palabraMayus = palabra.toUpperCase();
        System.out.println("La palabra en mayuscula es: " + palabraMayus);
        imprimirVocal(palabraMayus);

    }

    public static void imprimirVocal(String palabra){

        String vocales = "aeiouAEIOU";

        // Bucle que recorre todas las vocales
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (vocales.indexOf(caracter) != -1) { // Si el caracter es una vocal
                    System.out.println("La vocal encontrada es: " + caracter);
            }
        }
    }
}
