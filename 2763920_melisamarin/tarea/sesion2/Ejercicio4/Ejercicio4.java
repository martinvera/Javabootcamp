package com.tarea.sesion2.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Palabra ePalabra = new Palabra();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        ePalabra.setValor(scanner.nextLine());

        System.out.println("Texto a mayuscula > " + ePalabra.textoAMayuscula(ePalabra.getValor()));

        char[] letras = ePalabra.descomponerTexto();

        ePalabra.obtenerVocal(letras);
    }
}
