package com.ejemplo.herencia;

public class EmpleadoTiempoCompleto extends Empleado {

    private double bono;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + this.bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
