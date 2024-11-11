package com.ejemplo.operadores;

public class OperadorCondicional {
    public static void main(String[] args) {
        // Operador AND
        String color = "rojo";
        String marcaAuto = "Nissan";
        String resultado = "";

        if (color.equals("azul") && marcaAuto.equals("Toyota")) {
            resultado = "Mi auto es color " + color + " y marca " + marcaAuto;
        } else if (color.equals("rojo") && marcaAuto.equalsIgnoreCase("nissan")) {
            resultado = "Mi auto es color " + color + " y marca " + marcaAuto;
        }
        //System.out.println(resultado);

        // Operador OR
        int numero1 = 21;
        int numero2 = 18;
        String resultadoNumero = "";

        if (numero1 == numero2 || numero1 < numero2) {
            resultadoNumero = "Numero1 es igual o menor a Numero2";
        } else {
            resultadoNumero = "No cumple condicion OR";
        }
        //System.out.println(resultadoNumero);

        // Operador NOT
        boolean estaEncendido = true;
        String resultadoFlag = "";

        if (!estaEncendido) {
            resultadoFlag = "Esta encendido";
        } else {
            resultadoFlag = "No Esta encendido";
        }
        System.out.println(resultadoFlag);
    }
}
