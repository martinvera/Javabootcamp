package com.tarea.sesion2.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        Prestamo ePrestamo = new Prestamo(35500.00);
        System.out.println(String.format("%.2f", ePrestamo.getTotalPrestamo()));
        System.out.println(String.format("%.2f", ePrestamo.calcularInteres()));
        System.out.println(String.format("%.2f", ePrestamo.calcularIGV()));
    }
}
