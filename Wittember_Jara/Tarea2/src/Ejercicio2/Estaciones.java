package Ejercicio2;

import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estaciones estaciones = new Estaciones();

        System.out.println("Ingrese el día :");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes : ");
        int mes = scanner.nextInt();

        estaciones.mostrarEstacion(mes, dia);
    }
        public String EstracionesCalculados(int mes, int dia){
            if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia < 21)) {
                return "Primavera";
            } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia < 23)) {
                return "Verano";
            } else if ((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia < 21)) {
                return "Otoño";
            } else {
                return "Invierno";
            }
        }
        public void mostrarEstacion(int mes, int dia) {
            String estacion = EstracionesCalculados(mes, dia);
            System.out.println("La fecha " + dia + "/" + mes + " corresponde a la estación: " + estacion);
        }
}
