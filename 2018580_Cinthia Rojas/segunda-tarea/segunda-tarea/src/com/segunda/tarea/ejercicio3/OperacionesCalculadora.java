package com.segunda.tarea.ejercicio3;

import java.util.Scanner;

public class OperacionesCalculadora {
    //2018580 Cinthia Rojas
    public int numero1;
    public int numero2;
    public int suma, resta, division, multiplicacion, potencia;

    //Constructor de la clase
    public OperacionesCalculadora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = scanner.nextInt();

        /*Otra manera de ingresar numero en parametros del constructor
        public OperacionesCalculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }*/

    }

    //Metodo Operaciones de la calculadora
    public void Operaciones () {
        if (numero1 == 0 || numero2 == 0) {
            throw new RuntimeException("Los numeros ingresados no pueden ser 0, por favor ingrese otro numero");
        } else {
            suma = numero1 + numero2;
            resta = numero1 - numero2;
            multiplicacion = numero1 * numero2;
            division = (int) (numero1 * 1.0 / numero2);
            potencia = (int) Math.pow(numero1 , numero2);

        }

    }

}
