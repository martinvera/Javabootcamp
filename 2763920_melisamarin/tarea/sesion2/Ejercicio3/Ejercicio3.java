package com.tarea.sesion2.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora eCalc = new Calculadora();

        System.out.print("SUMA | RESTA | MULTI | DIVIS | POTENCIA > ");
        String valor = scanner.nextLine().toUpperCase();

        System.out.print("Num 1 > ");
        eCalc.setNum1(scanner.nextInt());

        System.out.print("Num 2 > ");
        eCalc.setNum2(scanner.nextInt());

        eCalc.realizarOperacion(Calculadora.Operacion.valueOf(valor));

        System.out.println(eCalc.getResultado());
    }
}
