package com.sesion01.ejercicios;

public class ejercicio5 {
    public static void main(String[] args) {
        float interes = 0.25F;
        double prestamo = 35_000;
        float igv = 0.18F;

        System.out.println("Prestamo de " + prestamo);
        System.out.println("Interes de " + interes * 100 + "%");

        double interesPrestamo, igvPrestamo;

        interesPrestamo = (double) prestamo * interes;
        igvPrestamo = (double) interesPrestamo * igv;

        System.out.println("Interes del prestamo corresponde a " + interesPrestamo);
        System.out.println("IGV del interes del prestamo " + igvPrestamo);
    }
}
