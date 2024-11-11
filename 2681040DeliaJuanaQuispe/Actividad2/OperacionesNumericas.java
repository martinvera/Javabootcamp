package Actividad2;

import java.util.Scanner;

public class OperacionesNumericas {
    double n1,n2;
    double suma, resta,multiplicacion,division;
    double resultados;

   // metodo sin retorno
    public void PedirNumero(){
        Scanner datos= new Scanner(System.in);
        System.out.println("Ingresea numero 1: ");
        n1= datos.nextDouble();
        System.out.println("Ingrese numero 2: ");
        n2= datos.nextDouble();

    }
    // metodo para sumar es los numeros
    public   void  suma(){
        suma= n1+n2;
     }
    public  void  resta(){
        resta= n1-n2;
    }
    public  void  multiplicacion(){
        multiplicacion= n1*n2;
    }
    public  void  division(){
        division= n1/n2;
    }
    public  void  potencia(){
         resultados= Math.pow(n1,n2);
    }
    public  void  muestraResultados(){
        System.out.println( "La suma es: "+ suma);
        System.out.println("La resta es : "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La division es:"+ division);
        System.out.println("Potencia es: " + Math.pow(n1,n2));
    }
}
