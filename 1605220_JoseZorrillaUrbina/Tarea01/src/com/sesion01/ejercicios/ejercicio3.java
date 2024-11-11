package com.sesion01.ejercicios;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Thread.sleep;

public class ejercicio3 {
    public static void main(String[] args) throws InterruptedException {
        double var1 = 0;
        double var2 = 0;
        int opcion = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Seleccione una operación para realizar: ");
            System.out.println("   Escriba 1 para Sumar");
            System.out.println("   Escriba 2 para Restar");
            System.out.println("   Escriba 3 para Multiplicar");
            System.out.println("   Escriba 4 para Dividir");
            System.out.println("   Escriba 5 para Potencia");
            System.out.println("   Escriba 0 para Salir");

            opcion = scanner.nextInt();

            if (opcion!=0) {
                System.out.println("Ingrese el primer valor : ");
                var1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo valor :");
                var2 = scanner.nextDouble();
            }

            switch (opcion) {
                case 1:
                    sumar(var1, var2);
                    break;
                case 2:
                    restar(var1, var2);
                    break;
                case 3:
                    multiplicar(var1, var2);
                    break;
                case 4:
                    dividir(var1, var2);
                    break;
                case 5:
                    potencia(var1, var2);
                    break;
            }

            if (opcion !=0) {
                try {
                    sleep(15000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (opcion != 0);
    }


    private static void sumar(double var1, double var2) {
        double resultado = 0;
        resultado = var1 + var2;
        System.out.println("La suma del valor#1 " + var1 + " y el valor#2 " + var2 + " es " + resultado);
    }

    private static void restar(double var1, double var2) {
        if(var1 < var2){
            System.out.println(var1 + " es menor que " + var2 + ", generará un número negativo");
        }
        double resultado = 0;
        resultado = var1 - var2;
        System.out.println("La resta del valor#1 " + var1 + " y el valor#2 " + var2 + " es " + resultado);
    }

    private static void multiplicar(double var1, double var2) {
        double resultado;
        resultado = var1 * var2;
        System.out.println("La multiplicación del valor#1 " + var1 + " y el valor#2 " + var2 + " es " + resultado);
    }

    private static void dividir(double var1, double var2) {
        double resultado = 0;
        resultado = (var2==0)?0:var1 / var2;
        System.out.println("La division del valor#1 " + var1 + " y el valor#2 " + var2 + " es " + resultado);
    }

    private static void potencia(double var1, double var2) {
        double resultado = 0;
        resultado = pow(var1, var2);
        System.out.println("La potencia del valor#1 " + var1 + " y el valor#2 " + var2 + " es " + resultado);

    }

}
