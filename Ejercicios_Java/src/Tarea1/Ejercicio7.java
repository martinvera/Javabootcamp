package Tarea1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Imprimir el día de una fecha cualquiera.
        System.out.print("Ingrese una fecha en formato dd/MM/yyyy: ");
        String fechaInput = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaInput, formatter);
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        System.out.println("El día de la semana es: " + diaDeLaSemana);
    }
}
