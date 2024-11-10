import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 9: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                esPrimo = false;
                break;
            }
        }
        if (esPrimo){
            System.out.println("El número " + numero + " es primo");
        }else {
            System.out.println("El número " + numero + " no es primo");
        }

    }
}
