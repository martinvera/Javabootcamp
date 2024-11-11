/*
1. Elaborar un programa en java que permita recorrer los 30 días del mes y
   muestre a los días impares.
 */

public class ejercicio1 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 30; i++) {
            numeroImpar(i);
        }
    }

    public static void numeroImpar(int numero){
        if (numero % 2 != 0) {
            System.out.println("Día impar " + numero);
        }
    }
}
