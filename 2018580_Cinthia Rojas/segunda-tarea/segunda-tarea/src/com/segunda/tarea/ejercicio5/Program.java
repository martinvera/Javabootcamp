package com.segunda.tarea.ejercicio5;

public class Program {
    public static void main(String[] args) {
        InteresPrestamoIgv interesPrestamoIgv = new InteresPrestamoIgv(0.255, 35500, 0.18);
        interesPrestamoIgv.CalcularInteresPrestamo();
        interesPrestamoIgv.CalcularIgvPrestamo();

        System.out.println("El interes del 25.5% del prestamo de 35.500 es: " + interesPrestamoIgv.calcularInteres);
        System.out.println("El IGV del interes calculado es: " + interesPrestamoIgv.calcularIgv );
    }
}
