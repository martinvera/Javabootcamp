package com.ejercicios.resuelto3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoge una Operación :\n " + "1 : suma \n" +  "2 : Resta \n" + "3 : Multiplicación \n" +  "4 : División");
        int oper = scanner.nextInt();

        System.out.println("Ingrese el primer numero : ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero : ");
        int num2 = scanner.nextInt();

       // int oper = 5;
        String resultado = "";
        Operacion operacionSuma = new operacionSuma(num1,num2);
        Operacion operacionResta = new OperacionResta(num1,num2);
        Operacion operacionMulti = new OperacionMulti(num1,num2);
        Operacion operacionDivi = new OperaconDivi(num1,num2);

        resultado = switch (oper) {
            case 1 -> "La Suma es: " + operacionSuma.calcularOperacion();
            case 2 -> "La Resta es: " + operacionResta;
            case 3 -> "La Multiplicación es: " + operacionMulti;
            case 4 -> "La División es: " + operacionDivi;
            default -> "Dato Errado";
        };
        System.out.println(" " + resultado);
    }
}
