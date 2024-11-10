package com.tarea;


public class tarea5 {

   /* 5. Elaborar un programa en java que permita calcular el interés del 25.5 % de un
   préstamo de 35,500 y calcular el igv del 18% del interés calculado.
    */

    public static void main(String[] args) {
        double prestamo = 35.500;
        double interes = 0.255;
        double igv = 0.18;

        double interesCalculado = prestamo * interes;
        double igvCalculado = interesCalculado * igv;

        System.out.println("El interés calculado es de: " + interesCalculado);

        System.out.println("El IGV calculado respecto al interes es de: " + igvCalculado);
    }
}
