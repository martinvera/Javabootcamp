import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //NúmeroPrimo, aquellos que solo se pueden dividir por sí mismos o por la unidad,
        boolean esprimo = false;
        //Solicitamos ingresar un número entero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresar un número entero" );
        int numeroEntero = scanner.nextInt();

        //Al iterar hasta la raíz cuadrada de un número, se optimiza el rendimiento, ya que no es necesario verificar divisores mayores que esa raíz.
        for( int i=2;i<=Math.sqrt(numeroEntero);i++){
            if (numeroEntero % i == 0) {
                esprimo = false; // Si es divisible por i, no es primo
                break; //salir de bucle
            }
            esprimo = true;
        }

        if (esprimo) {
            System.out.println(numeroEntero + " es un número primo.");
        } else {
            System.out.println(numeroEntero + " no es un número primo.");
        }


    }
}
