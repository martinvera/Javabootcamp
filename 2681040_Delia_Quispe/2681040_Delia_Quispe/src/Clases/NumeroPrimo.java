package Clases;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner datoEntrada = new Scanner(System.in);
        int num, i = 1, b = 0;
        System.out.println("Ingrese el numero : ");
        num = datoEntrada.nextInt();
        while (i <= num) {
            if (num % i == 0) {
                b++;
            }
            i++;
        }

        if (b == 2) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println(" EL numero " + num + " no es primo");
        }
    }
}
