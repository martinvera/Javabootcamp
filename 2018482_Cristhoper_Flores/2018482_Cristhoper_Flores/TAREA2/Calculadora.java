//3. Elaborar un programa en java que simule una calculadora para sumar, restar, dividir y calcular la potencias.
//**************

import java.util.Scanner;

public class Calculadora {
    
    public static Double sumar(double num1, double num2){
        return num1 + num2;
    }
    public static Double restar(double num1, double num2){
        return num1 - num2;
    }
    public static Double dividir(double num1, double num2){    
            return num1 / num2;    
    }
    public static Double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }
    public static Double operacion(int tipoOperacion, double num1, double num2){
        double resultado = 0;
        switch (tipoOperacion) {
            case 1:
                resultado =  sumar(num1, num2);
                break;
            case 2:
                resultado =  restar(num1, num2);
                break;
            case 3:
                resultado =  dividir(num1, num2);
                break;
            case 4:
                resultado =  potencia(num1, num2);
                break;             
        }
        return  resultado;    
    }
   
    public static void main(String[] args) {
        double num1;
        double num2;
        System.out.println("Que operacion deseas realizar: \n 1.Sumar \n 2.Restar \n 3.Dividir \n 4.Potencia ");
        Scanner scanner = new Scanner(System.in);
        int tipoOperacion = scanner.nextInt();
        if(tipoOperacion >= 1 && tipoOperacion <=4){
            System.out.println("Ingrese el 1er numero: ");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el 2do numero: ");
            num2 = scanner.nextDouble();
            if(tipoOperacion == 3 && num2 == 0){
                System.out.println("Error: No se puede dividir por cero ");
            }else{
                System.out.println("El resultado es: " + operacion(tipoOperacion, num1, num2));
            }
        }else{
            System.out.println("La opcion no es valida");
        }   
    
    }    
}
