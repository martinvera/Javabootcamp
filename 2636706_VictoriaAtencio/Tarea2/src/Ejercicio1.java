import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Elaborar un programa en java que permita recorrer los 30 días del mes y muestre a los días impares.

        //El Ejercicio 1. Solicita el mes y año, te recorre todos los días del mes y muestra a los días impares.

        Scanner scanner = new Scanner(System.in);
        FuncionesTiempo funcionesTiempo = new FuncionesTiempo();

        //Solicitamos ingrese el mes
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();

        //Solicitamos ingrese el año
        System.out.println("Ingrese el año");
        int ano = scanner.nextInt();


        //Obtenemos la cantidad de días que tiene el mes y año ingresado
        int diasEnMes = funcionesTiempo.diasDelMes(ano,mes);

        System.out.println("La cantidad de dias en el mes y año ingresado es "+ diasEnMes);

        // Imprimir días impares
        imprimirDiasImpares(diasEnMes);
    }

    public static void imprimirDiasImpares(int cantDias) {
        for (int i=1;i<=cantDias;i++){
            //Un número es impar si el resto de su división por 2 es diferente de cero
            if (i%2 !=0){
                System.out.println( i);
            }
        }

    }
}
