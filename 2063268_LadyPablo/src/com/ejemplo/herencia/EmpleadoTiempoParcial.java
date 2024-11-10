package com.ejemplo.herencia;

public class EmpleadoTiempoParcial extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoParcial(String nombre, int edad, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (this.horasTrabajadas * this.tarifaPorHora);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

}
