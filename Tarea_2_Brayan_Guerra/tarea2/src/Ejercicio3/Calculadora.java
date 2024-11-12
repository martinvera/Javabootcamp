package Ejercicio3;

import java.util.Scanner;

public class Calculadora {
    private int opcion;
    //Metodo para ingresar la operacion a realizar

    public void ingreasrOperacion()    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        float numero1 = input.nextFloat();
        System.out.println("Ingrese otro numero");
        float numero2 = input.nextFloat();
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("/Elija una operación");
            opcion = input.nextInt();
        } while (opcion < 0 || opcion > 6);
        switch (opcion) {
            case 1 -> System.out.println("La suma es: " + (numero1 + numero2));
            case 2 -> System.out.println("La diferencia es: " + (numero1 - numero2));
            case 3 -> System.out.println("El producto es: " + (numero1 * numero2));
            case 4 -> System.out.println("El cociente es: " + (numero1 / numero2));
            case 5 -> System.out.println("La potencia es: " + (Math.pow(numero1, numero2)));
        }
    }
}
