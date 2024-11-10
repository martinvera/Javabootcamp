package ejercicios.clase.dos;

import java.util.Scanner;


public class Mayusculas {

    static Scanner sc = new Scanner(System.in);
    static String cadena;
    public static void main(String[] args) {

        System.out.println("El texto en Mayuscula es: " + convertiraMayuscula());
        //Extrae vocales
        extraeVocales();
    }

    public static String convertiraMayuscula (){

        System.out.println("Ingrese una cadena de palabras: ");
        cadena = sc.nextLine();

        return cadena.toUpperCase();

    }

    public static void extraeVocales (){

        for (int i = 0; i < cadena.length(); i++) {
            char vocal = cadena.toLowerCase().charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                System.out.print(vocal);
            }
        }
    }
}
