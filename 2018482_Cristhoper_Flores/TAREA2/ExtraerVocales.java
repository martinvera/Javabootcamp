//4. Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas a mayúsculas y que extraiga las vocales que se identifique 
//   dentro de la palabra o cadena de texto y mostrarlo en pantalla.

import java.util.Scanner;

public class Ejercicio4 {
    
    public static String mostrarVocales(String palabra){
        String textoMayuscula = palabra.toUpperCase();
        StringBuilder vocales = new StringBuilder();
        for(int i=0; i < textoMayuscula.length(); i++){
            char recorrervocales = textoMayuscula.charAt(i);
            if(recorrervocales == 'A'|| recorrervocales == 'E' || recorrervocales == 'I' || recorrervocales == 'O' || recorrervocales == 'U'){
                vocales.append(recorrervocales);
            }
        }
        return vocales.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto o palabra: ");
        String texto = scanner.nextLine();
        System.out.println("Las vocales encontradas dentro del texto fueron: " + mostrarVocales(texto));

    }
}
