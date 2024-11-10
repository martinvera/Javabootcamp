package ejercicios.clase.uno;

import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Ingrese un texto en minuscula: ");
        String cadena = scanner.nextLine();

        String mayuscula = cadena.toUpperCase();
        System.out.println("El texto en Mayuscula es: " + mayuscula);

        for (i = 0; i < cadena.length(); i++) {
             char vocal = cadena.toLowerCase().charAt(i);
             if (vocal == 'a' || vocal == 'e' || vocal == 'i' ||
                 vocal == 'o' || vocal == 'u') {
                 System.out.println("Vocal Encontrada: " + vocal);
             }
        }
    }
}
