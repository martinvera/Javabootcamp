package ejercicios.tcs;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // Números menores o iguales a 1 no son primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Encontró un divisor, no es primo
                    break; // No es necesario seguir comprobando
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
}
