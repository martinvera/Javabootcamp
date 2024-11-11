package com.tarea.tarea5;

public class PrestamoInteres {
    public static void main(String[] args) {
        /*Elaborar un programa en java que permita calcular el interés del 25.5 % de un préstamo de 35,500
        y calcular el igv del 18% del interés calculado.*/

        double interes = 0.255 * 35500;
        double igv = interes * 0.18;

        System.out.println("El interes del 25.5% del prestamo de 35.500 es: " + interes);
        System.out.println("El IGV del interes calculado es: " + igv );

    }
}
