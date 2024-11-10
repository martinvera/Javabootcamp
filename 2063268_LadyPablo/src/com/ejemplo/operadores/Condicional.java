package com.ejemplo.operadores;

public class Condicional {
    public static void main(String[] args) {
        // Operador Ternario
        int edad = 15;
        String resultadoOperadorTernario = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        //System.out.println("Resultado Operador Ternario: " + resultadoOperadorTernario);

        // Condicionales if
        String resuladoCondicional = "Es menor de edad";

        if (edad >= 18) {
            resuladoCondicional = "Es mayor de edad";
        }
        //System.out.println("Resultado Condicional if: " + resuladoCondicional);

        // Condicionales if else
        String resuladoCondicionalIfElse = "";
        if (edad >= 18) {
            resuladoCondicionalIfElse = "Es mayor de edad";
        } else {
            resuladoCondicionalIfElse = "Es menor de edad";
        }
        //System.out.println("Resultado Condicional if else: " + resuladoCondicionalIfElse);

        // Condicionales if else if
        String resultadoCondicionalIfElseIf = "";
        // Condicionales if else if
        if (edad == 18) {
            resultadoCondicionalIfElseIf = "Tiene 18 años";
        } else if (edad > 18) {
            resultadoCondicionalIfElseIf = "Es mayor a 18 años";
        } else {
            resultadoCondicionalIfElseIf = "Es menor a 18 años";
        }
        //System.out.println("Resultado Condicional if else if: " + resultadoCondicionalIfElseIf);

        // Switch
        int diaSemana = 1;
        String resultadoDiaSemana = "";
/*
        switch (diaSemana) {
            case 1:
                resultadoDiaSemana = "Es Lunes";
                break;
            case 2:
                resultadoDiaSemana = "Es Martes";
                break;
            case 3:
                resultadoDiaSemana = "Es Miercoles";
                break;
            default:
                resultadoDiaSemana = "Dato ilegal";
        }
        System.out.println("Resultado dia de semana (Switch): " + resultadoDiaSemana);*/

        // Switch Expression
        resultadoDiaSemana = switch (diaSemana) {
            case 1 -> "Es Lunes";
            case 2 -> "Es Martes";
            case 3 -> "Es Miercoles";
            default -> "Dato ilegal";
        };
        System.out.println("Resultado dia de semana (Swith Expression): " + resultadoDiaSemana);
    }
}
