import java.util.Date;
import java.util.Scanner;

public class diaFecha {
    public static void main(String[] args) {
        String dias[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha :");
        Date fecha = new Date(scanner.next());
        int dia = fecha.getDay();
        System.out.println("La fecha ingresada es día " + dias[dia]);


    }
}
