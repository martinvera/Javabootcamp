package TAREA1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o cadena de texto en minúsculas: ");
        String texto = scanner.nextLine();

        // Convertir el texto a mayúsculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);

        // Extraer las vocales
        StringBuilder vocalesEncontradas = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {  // Verifica si el carácter es una vocal
                vocalesEncontradas.append(c);
            }
        }

        System.out.println("Vocales encontradas: " + vocalesEncontradas.toString());

        scanner.close();
    }
}
