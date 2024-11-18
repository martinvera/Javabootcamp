import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a consultar si es un numero primo: ");
        int numero = scanner.nextInt();

            if (numero % 2 == 0){
                System.out.println("El numero " +numero+ " no es primo");
            }else{
                System.out.println("El numero " +numero+ " es primo");
            }

    }
}
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
