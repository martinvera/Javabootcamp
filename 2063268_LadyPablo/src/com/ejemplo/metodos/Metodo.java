package com.ejemplo.metodos;

import java.time.LocalDate;
import java.time.Month;

public class Metodo {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Harry");
        persona.setApellido("Bravo");
        persona.setFechaNacimiento(LocalDate.of(1980, Month.JULY, 13));

        //int edad = persona.calcularEdad();
        //System.out.println("Edad de la persona: " + edad);

        //System.out.println(persona);

        /*Metodo metodo = new Metodo();
        int suma = metodo.sumarEnteros(10, 5);
        System.out.println(suma);*/

        //System.out.println(Metodo.sumarEnteros(10, 5));

        //imprimirSaludo("Harry");

        imprimirFrutas("Pera", "Manzana", "Platano", "Naranja");
    }

    // Metodo de instancia
    /*public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
    }*/

    // Metodo estatico
    public static int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void imprimirSaludo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // Var args
    public static void imprimirFrutas(String... frutas) {
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
