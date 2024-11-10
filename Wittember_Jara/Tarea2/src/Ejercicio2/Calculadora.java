package Ejercicio2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Instancia nuevo objeto - Calculadora asigna a la variable calculadora para poder llamar al método = calculadora.sumar
        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación a realizar : ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Potencia");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println( " *****************************\n " + "Resultado: " + calculadora.sumar(num1, num2));
                break;
            case 2:
                System.out.println(" *****************************\n "+"Resultado: " + calculadora.restar(num1, num2));
                break;
            case 3:
                System.out.println(" *****************************\n "+"Resultado: " + calculadora.dividir(num1, num2));
                break;
            case 4:
                System.out.println(" *****************************\n "+"Resultado: " + calculadora.potencia(num1, num2));
                break;
            default:
                System.out.println("Error - Opción no válida");
        }
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN; // indica que no se puede dividir por cero
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);

    }
}
