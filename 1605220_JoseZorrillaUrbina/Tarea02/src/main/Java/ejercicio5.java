/*
5. Elaborar un programa en java que permita calcular el interés del 25.5 % de
   un préstamo de 35,500 y calcular el igv del 18% del interés calculado.
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        float interes = 0.25F;
        double prestamo = 35_000;
        float igv = 0.18F;
        double interesPrestamo, igvPrestamo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el importe del prestamo");
        prestamo = scanner.nextDouble();
        System.out.println("Ingrese la tasa de interes");
        interes = scanner.nextFloat();

        interesPrestamo = calcularInteresPrestamo(prestamo, interes);
        igvPrestamo = calcularIgvPrestamo(interesPrestamo, igv);

        mostrarResultado(prestamo, interesPrestamo, igvPrestamo);
    }

    private static Double calcularInteresPrestamo(Double prestamo, Float interes){
        return (double) prestamo * (interes / 100);
    }

    private static Double calcularIgvPrestamo(Double intPrestamo, Float igv){
        return (double) intPrestamo * igv;
    }

    private static void mostrarResultado(Double prestamo, Double intPrestamo, Double igvPrestamo){
        System.out.println("Importa del Prestamo es " + prestamo);
        System.out.println("Interes del prestamo corresponde a " + intPrestamo);
        System.out.println("IGV del interes del prestamo " + igvPrestamo);
        System.out.println("Total del Prestamo es " + (prestamo+intPrestamo+igvPrestamo));
    }
}
