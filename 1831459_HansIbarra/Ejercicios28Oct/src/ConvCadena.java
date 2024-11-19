import java.util.Locale;
import java.util.Scanner;

public class ConvCadena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra en MINÚSCULA");
        String palabra =  scanner.nextLine();

        System.out.println("La cadena de texto *"  + palabra + "* en mayuscula es: " + palabra.toUpperCase());

        int totalVocales = palabra.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
        System.out.println("El total de vocales es " + totalVocales);

    }
}