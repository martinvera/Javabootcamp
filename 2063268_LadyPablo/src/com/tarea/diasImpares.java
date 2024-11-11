package com.tarea;

public class diasImpares {
    public static void main(String[] args) {
        // Recorrer los días del mes
        for (int dia = 1; dia <= 30; dia++) {
            // Comprobar si el día es impar
            if (dia % 2 != 0) {
                System.out.println("Día impar: " + dia);
            }
        }
    }
}
