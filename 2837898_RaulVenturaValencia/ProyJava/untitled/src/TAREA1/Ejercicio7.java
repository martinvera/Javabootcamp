package TAREA1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una fecha en formato AAAA-MM-DD: ");
        String fechaInput = scanner.nextLine();

        //En Java, el bloque try-catch se utiliza para detectar
        //y controlar excepciones que pueden ocurrir durante la ejecución de un programa

        try {
            // Convertir la cadena de texto en un objeto LocalDate
            LocalDate fecha = LocalDate.parse(fechaInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Obtener el día de la semana
            DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();

            System.out.println("El día de la semana es: " + diaDeLaSemana);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, use el formato AAAA-MM-DD.");
        }

        scanner.close();
    }
}
