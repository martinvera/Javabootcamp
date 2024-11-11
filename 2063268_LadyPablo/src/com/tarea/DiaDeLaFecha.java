package com.tarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DiaDeLaFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una fecha (formato: yyyy-MM-dd): ");
        String fechaEntrada = scanner.nextLine();

        try {
            // Definir el formato de la fecha
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Parsear la fecha
            LocalDate fecha = LocalDate.parse(fechaEntrada, formatter);

            // Obtener el día de la semana
            String diaDeLaSemana = fecha.getDayOfWeek().name();
            System.out.println("El día de la semana es: " + diaDeLaSemana);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, use el formato yyyy-MM-dd.");
        }

        scanner.close();
    }
}
