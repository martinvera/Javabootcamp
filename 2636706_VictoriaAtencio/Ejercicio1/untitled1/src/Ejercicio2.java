import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de mes");
        int mes = scanner.nextInt();

        switch (mes){
            case 1:
            case 2:
            case 3:
                System.out.println("Es verano");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Es otoño");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Es invierno");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Es primavera");
                break;

        }
    }
}
