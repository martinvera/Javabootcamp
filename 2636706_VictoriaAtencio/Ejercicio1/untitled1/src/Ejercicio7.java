import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Solicitamos ingrese una fecha en formato yyyy-MM-dd

        // se puede utilizar try catch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato yyyy-MM-dd");

        String fechaStr = scanner.nextLine();


        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fecha = LocalDate.parse(fechaStr,formater);

        String dia = fecha.getDayOfWeek().toString();

        // tambien se puede mostrar getdayofweek

        System.out.println("El día de la fecha es:" +dia);
    }
}
