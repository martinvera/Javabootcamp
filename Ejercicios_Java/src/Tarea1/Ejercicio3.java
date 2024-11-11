package Tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Elaborar un programa en java que simule una calculadora para sumar, restar, dividir y calcular la potencias.
        System.out.println("Seleccione una operación:");
        System.out.println("1 = Sumar");
        System.out.println("2 = Restar");
        System.out.println("3 = Dividir");
        System.out.println("4 = Potencia");

        int operacion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar la operación seleccionada
        switch (operacion) {
            case 1 -> System.out.println("Resultado de la suma: " + (num1 + num2));
            case 2 -> System.out.println("Resultado de la resta: " + (num1 - num2));
            case 3 -> {
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            }
            case 4 -> System.out.println("Resultado de la potencia: " + Math.pow(num1, num2));
            default -> System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
        }
    }
}
