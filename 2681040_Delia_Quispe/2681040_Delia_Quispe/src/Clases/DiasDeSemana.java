package Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiasDeSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha yyyy-mm-dd:  ");
        String IngresarFecha = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(IngresarFecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("El día de la fecha ingresada es : " + " " + fecha.getDayOfWeek());
        scanner.close();


    }
}
