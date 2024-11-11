package ejercicios.clase.dos;

import java.util.Scanner;

public class DiasdelMes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // # de dias de los meses
        int dias [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Ingrese Numero del Mes: ");
        int mes = sc.nextInt();

        if (mes>0 && mes<=12) {
            for (int i = 0; i <= dias[mes - 1]; i++) {
                diasImpares(i);
            };
        }else
               System.out.println("Numero del Mes fuera de rango");
    }
    //Metodo
    public static void diasImpares(int i) {

        if (i % 2 != 0) {
            System.out.println("Dia Impar: " + i);
        };
    }
}
