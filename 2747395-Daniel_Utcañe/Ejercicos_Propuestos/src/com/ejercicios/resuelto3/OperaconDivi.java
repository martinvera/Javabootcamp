package com.ejercicios.resuelto3;

public class OperaconDivi extends Operacion{

    //private double division;
    public OperaconDivi(int numero, int numero2) {
        super(numero, numero2);

    }


    @Override
    public double calcularOperacion() {

        return super.getNumero() / super.getNumero2();
    }


}
