package Tarea1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita mostrar las estaciones del año (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número del mes: ");
        int mes = scanner.nextInt();

        // Verificar y mostrar la estación correspondiente
        if (mes >= 3 && mes <= 5) {
            System.out.println("Primavera.");
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("Verano.");
        } else if (mes >= 9 && mes <= 11) {
            System.out.println("Otoño.");
        } else if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("Invierno.");
        } else {
            System.out.println("Número de mes no válido.");
        }
    }
}
