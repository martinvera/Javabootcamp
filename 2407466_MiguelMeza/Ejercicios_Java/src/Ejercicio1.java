import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita recorrer los 30 días del mes y muestre a los días impares.
        for (int dia = 1; dia <= 30; dia++) {
            if (dia % 2 != 0) {
                System.out.println("Día impar: " + dia);
            }
        }
    }
}