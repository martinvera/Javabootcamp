package Ejercicio5;

import java.util.Scanner;

public class CalcularInteres {

    public void interes(){
        Scanner input = new Scanner(System.in);
        int prestamo=0;
        System.out.println("Ingrese el monto del prestamo:");
        prestamo = input.nextInt();
        float interes = (25 * prestamo)/100;
        float igv = (18 * interes)/100;

        System.out.println("El prestamo es de " + prestamo);
        System.out.println("El interés es de " + interes);
        System.out.println("El IGV es de " + igv);
    }

}
