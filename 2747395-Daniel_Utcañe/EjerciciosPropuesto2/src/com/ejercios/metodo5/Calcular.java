package com.ejercios.metodo5;

public class Calcular {
    private int numero;



    public Calcular() {

    }
    public Calcular(int numero) {
        this.numero = numero;
    }

    public void calcular(){
        double inter = 0.255;
        double igv = 0.18;

        double intereses = this.numero * inter;
        double igvs = intereses * igv;

        System.out.println("El interes al 25% del capital es: "+ intereses);
        System.out.println("El IGV al 18% del Interes es: "+ igvs);

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
