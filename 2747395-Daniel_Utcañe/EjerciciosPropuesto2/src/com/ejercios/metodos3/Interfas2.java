package com.ejercios.metodos3;

import java.util.Scanner;

public class Interfas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoge una Operación :\n " + "1 : suma \n" +  "2 : Resta \n" + "3 : Multiplicación \n" +  "4 : División \n" +  "5 : División");
        int oper = scanner.nextInt();

        System.out.println("Ingrese el primer numero : ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero : ");
        int num2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora(num1, num2);

        if (oper == 1) {
            calculadora.suma();
        }
        if (oper == 2) {
            calculadora.resta();
        }
        if (oper == 3) {
            calculadora.multiplicacion();
        }
        if (oper == 4) {
            calculadora.division();
        }
        if (oper == 5) {
            calculadora.potencia();
        }


    }
}
