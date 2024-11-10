package com.ejemplo.metodos;

public class SobreCargaMetodo {
    public static void main(String[] args) {
        System.out.println(obtenerNombreCompleto("Harry", "Bravo"));
        System.out.println(obtenerNombreCompleto("Harry", "Frank", "Bravo", "Coronel"));
    }

    public static String obtenerNombreCompleto(String primerNombre, String apellidoPaterno) {
        return primerNombre + " " + apellidoPaterno;
    }

    public static String obtenerNombreCompleto(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno) {
        return primerNombre + " " + segundoNombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
