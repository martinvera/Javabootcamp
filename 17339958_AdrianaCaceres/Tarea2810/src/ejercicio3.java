/*3. Elaborar un programa en java que simule una calculadora para sumar, restar, dividir y calcular
la potencias.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero1: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese numero2: ");
        int numero2 = sc.nextInt();

        int suma= numero1+numero2;
        System.out.println("La suma de los numeros es: "+suma);

        int resta= numero1-numero2;
        System.out.println("La resta de los numeros es: "+resta);

        int multiplicacion= numero1*numero2;
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);

        if (numero2!=0) {
            int division = numero1 / numero2;
            System.out.println("La division de los numeros es: " + division);

        }
        else
        {
            System.out.println("No se puede dividir un numero con 0");
        }
    }
}
