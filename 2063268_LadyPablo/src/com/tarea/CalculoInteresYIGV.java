package com.tarea;

public class CalculoInteresYIGV {
    public static void main(String[] args) {
        // Definición de variables
        double prestamo = 35500; // Monto del préstamo
        double tasaInteres = 25.5 / 100; // Tasa de interés del 25.5%
        double igvTasa = 18 / 100; // Tasa del IGV del 18%

        // Cálculo del interés
        double interes = prestamo * tasaInteres;
        System.out.printf("Interés calculado: %.2f\n", interes);

        // Cálculo del IGV sobre el interés
        double igv = interes * igvTasa;
        System.out.printf("IGV (18%%) sobre el interés: %.2f\n", igv);

        // Mostrar el total a pagar (interés + IGV)
        double totalAPagar = interes + igv;
        System.out.printf("Total a pagar (interés + IGV): %.2f\n", totalAPagar);
    }
}
