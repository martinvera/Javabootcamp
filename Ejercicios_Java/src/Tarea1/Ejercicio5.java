package Tarea1;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Elaborar un programa en java que permita calcular el interés del 25.5 % de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.
        double prestamo = 35500;
        double porcentajeInteres = 25.5;
        double porcentajeIGV = 18;

        double interes = (prestamo * porcentajeInteres) / 100;
        System.out.println("Interés calculado: " + interes);

        double igv = (interes * porcentajeIGV) / 100;
        System.out.println("IGV sobre el interés: " + igv);
    }
}
