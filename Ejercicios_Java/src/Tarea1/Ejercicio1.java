package Tarea1;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita recorrer los 30 días del mes y muestre a los días impares.
        for (int dia = 1; dia <= 30; dia++) {
            if (dia % 2 != 0) {
                System.out.println("Día impar: " + dia);
            }
        }
    }
}
