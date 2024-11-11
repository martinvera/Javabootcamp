package com.segunda.tarea.ejercicio5;

//2018580 Cinthia Rojas
public class InteresPrestamoIgv {
    /*Elaborar un programa en java que permita calcular el interés del 25.5 % de un préstamo de 35,500
      y calcular el igv del 18% del interés calculado.*/

        public double calcularInteres, calcularIgv;
        public double interes;
        public double prestamo;

        public double igv;

        public InteresPrestamoIgv (double interes, double prestamo, double igv){
            this.interes = interes;
            this.prestamo = prestamo;
            this.igv = igv;
    }
    public void CalcularInteresPrestamo (){
            calcularInteres = interes * prestamo;
    }
    public void CalcularIgvPrestamo () {
            calcularIgv = calcularInteres * igv;

    }
}
