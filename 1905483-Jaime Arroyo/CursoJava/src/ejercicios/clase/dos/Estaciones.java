package ejercicios.clase.dos;

import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Fecha
        int mesInicial, mesFinal;

        System.out.println("Ingrese el Rango de Meses");
        System.out.println("=========================");
        System.out.println("\nMes Inicial: ");
        mesInicial = sc.nextInt();

        System.out.println("\nMes Final: ");
        mesFinal = sc.nextInt();

        //Validaciones
        if (validarMeses(mesInicial, mesFinal) =='S'){
            imprimirEstaciones(mesInicial, mesFinal);
        } else {
            System.out.println("Error en el Rango de Meses");
        }
    }

    public static char validarMeses(int mi, int mf){

        if (mi == 0 || mi > 12) {
            return 'N';
        } else if (mf == 0 || mf> 12) {
            return 'N';
        } else if (mi > mf) {
            return 'N';
        } else {
            return 'S';
        }
    }

    public static void imprimirEstaciones(int mi, int mf){

        String estacion;

        int i = mi;
        while (i <= mf) {
            if (i == 12 || i == 1 || i == 2) {
                estacion = "Verano";
            } else if (i == 3 || i == 4 || i == 5) {
                estacion = "Otoño";
            } else if (i == 6 || i == 7 || i == 8) {
                estacion = "Invierno";
            } else estacion = "Primavera";
            System.out.println("La estacion del mes " + i + " es " + estacion);
            i++;
        }
    }
}
