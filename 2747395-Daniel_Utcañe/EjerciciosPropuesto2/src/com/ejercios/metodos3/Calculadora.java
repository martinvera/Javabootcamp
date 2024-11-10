package com.ejercios.metodos3;

public class Calculadora {
    private int operador1;
    private int operador2;
   // private int oper;

    public Calculadora() {

    }

    public Calculadora(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        //this.oper = oper;
    }

    public void suma(){
        int suma = this.operador1 + this.operador2;
        System.out.println(" la suma de: " + this.operador1 + " + " + this.operador2 + " = " + suma);
    }

    public void resta(){
        int resta = this.operador1 - this.operador2;
        System.out.println(" la resta de: " + this.operador1 + " - " + this.operador2 + " = " + resta);
    }

    public void multiplicacion(){
        int multi = this.operador1 * this.operador2;
        System.out.println(" la Respuesta de: " + this.operador1 + " * " + this.operador2 + " = " + multi);
    }
    public void division(){
        if(this.operador2 == 0){
            System.out.println(" *** No se puede dividir entre cero *** " );
        }
        else{
            int resultado = this.operador1 / this.operador2;
            System.out.println(" la Respuesta de: " + this.operador1 + " / " + this.operador2 + " = " + resultado);
        }
    }
    public void potencia(){
        int resultado = this.operador1 ^ this.operador2;
        System.out.println(" la Respuesta de: " + this.operador1 + " ^ " + this.operador2 + " = " + resultado);
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
}
