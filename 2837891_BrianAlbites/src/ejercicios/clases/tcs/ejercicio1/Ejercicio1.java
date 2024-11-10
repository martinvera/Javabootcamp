package ejercicios.clases.tcs.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diasDelMes diasDelMes = new diasDelMes();

        System.out.print("Ingrese un número entre 1 al 12, recordar que 1 es enero, 2 febrero y así sucesivamente: ");
        int mes = scanner.nextInt();
        diasDelMes.listarDiasImpares(mes);
    }
}
