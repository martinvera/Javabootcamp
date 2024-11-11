//2. Elaborar un programa en java que permita mostrar las estaciones del año (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla. 

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void estacion(int mes){
        if (mes >= 3 && mes <= 5) {
            System.out.println("La estacion es Primavera");
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("La estacion es Verano");
        } else if (mes >= 9 && mes <= 11) {
            System.out.println("La estacion es Otoño");
        } else if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("La estacion es Invierno");
        } else {
            System.out.println("Mes fuera de rango (1 - 12)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes que desea saber la estacion (1 - 12):");
        int rangoMes= scanner.nextInt();

        estacion(rangoMes);
    }

}
