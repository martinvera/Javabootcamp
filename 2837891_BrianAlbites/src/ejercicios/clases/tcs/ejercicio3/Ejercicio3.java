package ejercicios.clases.tcs.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesArit operacionesArit = new OperacionesArit();

        System.out.print("Ingrese el primer número a operar: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número a operar: ");
        double num2 = scanner.nextDouble();

        operacionesArit.resultadoOperaciones(num1,num2);
    }
}
