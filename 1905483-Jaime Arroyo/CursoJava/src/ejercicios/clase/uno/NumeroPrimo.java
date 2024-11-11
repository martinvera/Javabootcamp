package ejercicios.clase.uno;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Numero: ");
        int numero = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i  <= numero; i++){
            if (numero % i == 0){
                primo = false;
                break;
            }
        }
        if (primo)
            System.out.println("El numero: " + numero + " es un numero primo");
        else
            System.out.println("El numero: " + numero + " es un numero primo");
    }
}
