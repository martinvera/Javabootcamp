import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha (dia/mes/año): ");
        String fechaIngresada = scanner.nextLine();

        try {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaIngresada, formatoFecha);

            String diaDeLaSemana = fecha.getDayOfWeek().toString();
            System.out.println("El dia de es: " + diaDeLaSemana);
        } catch (DateTimeParseException e) {
            System.out.println("Fecha inlida, el formato es DIA/MES/AÑO");
        }
        scanner.close();
    }
}
