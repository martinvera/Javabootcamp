package com.ejercicios.resuelto3;

public class OperacionResta extends Operacion {
    public OperacionResta(int numero, int numero2) {
        super(numero, numero2);
    }

    @Override
    public double calcularOperacion() {
        return super.getNumero() - super.getNumero2();
    }

}
