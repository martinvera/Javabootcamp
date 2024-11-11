package Ejercicio2;

import java.util.Scanner;

public class MayMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MayMin conversion = new MayMin();

        System.out.println("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        String textoMayusculas = conversion.convertirAMayusculas(texto);
        String vocales = conversion.extraerVocales(texto);

        System.out.println("Texto en mayúsculas: " + textoMayusculas);
        System.out.println("Vocales en el texto: " + vocales);
    }

    public String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public String extraerVocales(String texto) {
        StringBuilder vocales = new StringBuilder();
        // recorre cada caracter de la cadena texto y si c es una vocal grega el caracter c al final de la cadena vocales
        for (char c : texto.toCharArray()) {
            if (esVocal(c)) {
                vocales.append(c);
            }
        }
        return vocales.toString();
    }

    public boolean esVocal(char c) {
        // si c es una vocal, indexOf devolverá un valor distinto de -1
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
