package com.segunda.tarea.ejercicio3;

public class Program {
    public static void main(String[] args) {

        OperacionesCalculadora operacionesCalculadora = new OperacionesCalculadora();

        try {
            operacionesCalculadora.Operaciones();
        }
        catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("Resultados de las operaciones:");
        System.out.println("  Suma: " + operacionesCalculadora.suma);
        System.out.println("  Resta: " + operacionesCalculadora.resta);
        System.out.println("  Multiplicacion: " + operacionesCalculadora.multiplicacion);
        System.out.println("  Divison: " + operacionesCalculadora.division);
        System.out.println("  Potencia: " + operacionesCalculadora.potencia);
    }
}
