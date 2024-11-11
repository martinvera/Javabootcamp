package com.ejercios.metodos;

public class NumerosImpares {
 private int numero1;

    //constructor Vacio
    public NumerosImpares() {

    }

    // constructor con parametros
    public NumerosImpares(int nume1){
    this.numero1 = nume1;
    }


    //Metodo para obtener numeros impares
    public void operacion(){

        for (int i = 0; i <= this.numero1; i++) {
            if (i % 2 != 0) {
                System.out.println("Numero Impar: " + i);
            }
        }
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
}


