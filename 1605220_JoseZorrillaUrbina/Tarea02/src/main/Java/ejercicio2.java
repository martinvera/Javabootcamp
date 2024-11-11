/*
2. Elaborar un programa en java que permita mostrar las estaciones del año
   (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número del mes : ");
        int mes = scanner.nextInt();

        String estacion = "Mes invalido";

        estacion = estacionAnual(mes, estacion);

        System.out.println("El mes " + mes + " corresponde a la estación: " + estacion);
    }

    public static String estacionAnual(int numMes, String estacion) {
        switch (numMes) {
            case 3, 4, 5: // Marzo, Abril y Mayo
                estacion = "Otoño";
                break;
            case 6, 7, 8: // Junio, Julio y Agosto
                estacion = "Invierno";
                break;
            case 9, 10, 11: // Setiembre, Octubre y Noviembre
                estacion = "Primavera";
                break;
            case 12, 1, 2: // Diciembre, Enero y Febrero
                estacion = "Verano";
                break;
            default:
                estacion = "Mes inválido";
        }

        return estacion;
    }
}
