import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero del mes (1-12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1: //Enero
            case 2: //Febrero
            case 3: //Marzo
                System.out.println("Verano");
                break;
            case 4: //Abril
            case 5: //Mayo
            case 6: //Junio
                System.out.println("Otoño");
                break;
            case 7: //Julio
            case 8: //Agosto
            case 9: //Septiembre
                System.out.println("Invierno");
                break;
            case 10: //Octubre
            case 11: //Noviembre
            case 12: //Diciembre
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mes no valido. Introduce un numero del 1 al 12");
                break;
        }
        scanner.close();
    }
}
