package com.tarea.sesion2.Ejercicio5;

public class Prestamo {
    private double totalPrestamo;
    private double totalInteres;
    private double totalIGV;

    public Prestamo(double totalPrestamo) {
        this.totalPrestamo = totalPrestamo;
    }

    public double calcularInteres () {
        return this.totalPrestamo * 0.255;
    }

    public double calcularIGV () {
        return calcularInteres() * 0.18;
    }

    public double getTotalPrestamo() {
        return totalPrestamo;
    }

    public void setTotalPrestamo(double totalPrestamo) {
        this.totalPrestamo = totalPrestamo;
    }

    public double getTotalInteres() {
        return totalInteres;
    }

    public void setTotalInteres(double totalInteres) {
        this.totalInteres = totalInteres;
    }

    public double getTotalIGV() {
        return totalIGV;
    }

    public void setTotalIGV(double totalIGV) {
        this.totalIGV = totalIGV;
    }
}
