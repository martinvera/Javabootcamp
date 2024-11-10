package ejercicios.clases.tcs.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstacionesDelAnio estacionesDelAnio = new EstacionesDelAnio();

        System.out.print("Ingresa un número: (1 = VERANO, 2 = INVIERNO, 3 = OTOÑO, 4 = PRIMAVERA): ");
        int estacion = scanner.nextInt();

        estacionesDelAnio.obtenerEstaciones(estacion);
    }
}
