package com.tarea;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora.");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Potencia");
        System.out.print("Ingrese el número de la operación (1-4): ");

        int operacion = scanner.nextInt();
        double num1, num2, resultado;

        switch (operacion) {
            case 1: // Sumar
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2: // Restar
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3: // Dividir
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;

            case 4: // Potencia
                System.out.print("Ingrese la base: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el exponente: ");
                num2 = scanner.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operación inválida. Por favor, ingrese un número del 1 al 4.");
                break;
        }

        scanner.close();
    }
}

