package com.tarea.sesion2.Ejercicio3;

import com.sesion311024.Persona;

public class Calculadora {
    private int num1;
    private int num2;
    private double resultado;

    public Calculadora () {

    }

    public Calculadora (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public enum Operacion {
        SUMA, RESTA, MULTI, DIVIS, POTENCIA
    }

    public void realizarOperacion (Operacion operacion) {
        switch (operacion) {
            case SUMA: resultado = num1 + num2; break;
            case RESTA: resultado = num1 - num2; break;
            case MULTI: resultado = num1 * num2; break;
            case DIVIS: resultado = num1 / num2; break;
            case POTENCIA: resultado = Math.pow(num1, num2); break;
            default: System.err.println("Operacion no es valida");
        }
        setResultado(resultado);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
