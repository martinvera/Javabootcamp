package Preguntas;

import java.util.Scanner;

public class Pregunta2 {

    public void calculadora(){
        try { //Se pone todo el código dentro de un "TRY CATCH" para poder controlar las excepciones
            Scanner ingreso = new Scanner(System.in);
            System.out.println("Ingreso un número: "); //Pide ingresar un número por pantalla al usuario
            double num1 = ingreso.nextDouble(); //Guarda el valor en la variable "num1"
            double num2 = 0;
            do { // Se realiza el bucle para evitar que el segundo valor (El divisor) se igual a "0". El bucle no dejará salir hasta que sea diferente de 0
                System.out.println("Ingreso un segundo número: "); //Pide ingresar un segundo número
                num2 = ingreso.nextDouble(); //Guarda el valor en la variable "num2"
            } while (num2 == 0);
            double suma = num1 + num2; // La variable "Suma" guarda el resultado de la suma de los dos número
            double resta = num1 - num2; // La variable "Resta" guarda el resultado de la resta de los dos número
            double division = num1 / num2; // variable "División" guarda el resultado de la división de los dos número
            System.out.println("Ingrese el valor de la potencia para ambos número: "); //Pide el ingreso de un valor de la potencia
            int potencia = ingreso.nextInt(); //Guarda el valor ingresado en una variable entera
            double potenciaNum1 = Math.pow(num1, potencia); //Utiliza el método "POW" de la clase "Math" para elevar el valor por el número ingresado en la variable "potencia"
            double potenciaNum2 = Math.pow(num2, potencia); //Utiliza el método "POW" de la clase "Math" para elevar el valor por el número ingresado en la variable "potencia"

            System.out.println("La suma de los números es: " + suma); //Impresión y concatenación
            System.out.println("La resta de los números es: " + resta); //Impresión y concatenación
            System.out.println("La división de los números es: " + division); //Impresión y concatenación
            System.out.println("La potencia del primer número es: " + potenciaNum1); //Impresión y concatenación
            System.out.println("La potencia del segundo número es: " + potenciaNum2); //Impresión y concatenación

        }catch(Exception e){ //Si los valores ingresados no son números, se termina el flujo y se imprime el mensaje
            System.out.println("El valor ingresado no es un número. Se termina el flujo");
        }
    }
}
