package Ejercicio2;

import java.util.Scanner;

public class IngresarFecha {

    public void ingresarEstaciones() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese mes del año");
        String Unmes = input.next();
        System.out.println("Ingrese día del mes");
        int Undia = input.nextInt();
        Estaciones ingresarEstacion = new Estaciones();
        String estacion = ingresarEstacion.filtrasEstaciones(Unmes,Undia);
        System.out.println("La estación del año es: " + estacion);

    }
}
