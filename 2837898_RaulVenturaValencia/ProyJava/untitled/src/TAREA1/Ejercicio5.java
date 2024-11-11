package TAREA1;

public class Ejercicio5 {
    public static void main(String[] args) {
        double montoPrestamo = 3500;
        double tasaInteres = 25.5 / 100;  // Convertir el porcentaje a decimal
        double tasaIGV = 18 / 100;        // Convertir el porcentaje a decimal

        // Calcular el interés
        double interes = montoPrestamo * tasaInteres;
        System.out.println("Interés calculado: " + interes);

        // Calcular el IGV sobre el interés
        double igv = interes * tasaIGV;
        System.out.println("IGV sobre el interés: " + igv);
    }
}
