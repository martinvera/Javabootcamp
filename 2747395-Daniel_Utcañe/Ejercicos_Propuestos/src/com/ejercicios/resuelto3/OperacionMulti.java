package com.ejercicios.resuelto3;

public class OperacionMulti extends Operacion {
    public OperacionMulti(int numero, int numero2) {
        super(numero, numero2);
    }

    @Override
    public double calcularOperacion() {
        return super.getNumero() * super.getNumero2();
    }


}
