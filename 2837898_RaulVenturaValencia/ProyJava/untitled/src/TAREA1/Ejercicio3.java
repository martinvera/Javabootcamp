package TAREA1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Potencia (el primer número elevado al segundo)");

        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 4:
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado de la potencia: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
