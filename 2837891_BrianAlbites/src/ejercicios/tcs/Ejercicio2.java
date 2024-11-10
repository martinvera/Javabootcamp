package ejercicios.tcs;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escoge una estación del año (1 = VERANO, 2 = INVIERNO, 3 = OTOÑO, 4 = PRIMAVERA): ");
        short estacion = scanner.nextShort();

        switch (estacion){
            case 1 -> System.out.println("Los siguientes meses corresponden al verano: " +
                    "Enero, Febrero y Marzo");
            case 2 -> System.out.println("Los siguientes meses corresponden al invierno: " +
                    "Julio, Agosto y Septiembre");
            case 3 -> System.out.println("Los siguientes meses corresponden al otoño: " +
                    "Abril, Mayo y Junio");
            case 4 -> System.out.println("Los siguientes meses corresponden a la primavera: " +
                    "Octubre, Noviembre y Diciembre");
            default -> System.out.println("No escogio una estación correcta");
        }


    }
}
