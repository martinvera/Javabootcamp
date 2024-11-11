package com.tarea.tarea1;

public class DiaImpar {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita recorrer los 30 días del mes y muestre a los días impares.

        for (int dia = 1 ; dia <31; dia++) {
            if (dia % 2 != 0) {
                System.out.println("Dias impares del calendario: " + dia);
            }
        }
    }


}

