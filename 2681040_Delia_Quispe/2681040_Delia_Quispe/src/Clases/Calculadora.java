package Clases;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        int uno = scanner.nextInt();  // Leer un número entero
        System.out.println("El número introducido es " + uno);

        System.out.print("Introduzca 2do numero: ");
        int dos = scanner.nextInt();  // Leer un número entero
        System.out.println("El número introducido es " + dos);
        resultado = uno * dos;
        System.out.println("El resuladod es multiplicación  es : " + resultado);
        resultado = uno / dos;
        System.out.println("El resuladod de la división es : " + resultado);
        resultado = uno + dos;
        System.out.println("El resuladod de la suma es : " + resultado);
        resultado = uno - dos;
        System.out.println("El resuladod de la resta es : " + resultado);
    }
}
