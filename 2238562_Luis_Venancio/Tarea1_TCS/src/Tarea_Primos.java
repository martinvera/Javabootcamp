import java.util.Scanner;

public class Tarea_Primos{
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número >0: ");
            n = sc.nextInt();
        } while (n <= 0);

        if (n == 1) {  //el 1 no es primo
            System.out.println("No es primo");
        } else {
            i = 2;    //i es el divisor
            while (n % i != 0) {  //mientras el número no sea divisible por el divisor
                i++;
            }
            if (i == n) { //cuando sale del while, si el divisor es el propio número
                System.out.println("Es un número Primo");        //el número es primo
            } else {
                System.out.println("No es un número primo");  //sino no lo es
            }
        }
    }
}


