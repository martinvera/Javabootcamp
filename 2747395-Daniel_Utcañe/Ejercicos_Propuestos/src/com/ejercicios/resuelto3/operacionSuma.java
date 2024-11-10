package com.ejercicios.resuelto3;

public class operacionSuma extends Operacion{


    public operacionSuma(int numero, int numero2) {
        super(numero, numero2);

    }

    @Override
    public double calcularOperacion() {
        return super.getNumero() + super.getNumero2();
    }

}
