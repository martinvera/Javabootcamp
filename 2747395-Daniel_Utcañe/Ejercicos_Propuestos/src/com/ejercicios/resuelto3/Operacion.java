package com.ejercicios.resuelto3;

public abstract class Operacion {
    int numero;
    int numero2;
   // double res;
  //  char signo;

    //constructor
    public Operacion(int numero, int numero2) {
     this.numero = numero;
     this.numero2 = numero2;
    // this.signo = signo;
    }

    public abstract double calcularOperacion();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

//    @Override
//    public String toString() {
//        return  " " + calcularOperacion();
//
//    }

    /*
    public double getRes() {
        return res;
    }

    public void setRes(double resultado) {
        this.res = resultado;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }

     */
}
