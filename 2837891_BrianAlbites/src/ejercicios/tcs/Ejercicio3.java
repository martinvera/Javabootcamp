package ejercicios.tcs;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número a operar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número a operar: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multi = num1 * num2;
        double divi = num1 / num2;
        double potencia = Math.pow(num1,num2);

        System.out.println("");
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicacion de los números es: " + multi);
        System.out.println("La division de los números es: " + divi);
        System.out.println("La potencia del primer número elevado al segundo es: " + potencia);
    }
}
