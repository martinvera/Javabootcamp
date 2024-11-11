package com.ejercicios.resuelto5;

public class CalcularInteres {
    public static void main(String[] args) {
        int capital = 35500;
        double porcenInters = 0.255;
        double porcenIgv = 0.18;
        double interes;
        double igvInt;

        interes = capital * porcenInters;
        igvInt = interes * porcenIgv;

        System.out.println("El interes al 25% del capital es: "+ interes);
        System.out.println("El IGV al 18% del Interes es: "+ igvInt);


    }
}
