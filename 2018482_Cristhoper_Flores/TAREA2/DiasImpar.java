//1. Elaborar un programa en java que permita recorrer los 30 días del mes y muestre a los días impares.
public class Ejercicio1 {
    public static void main(String[] args) {
        
            System.out.println("Dias impares:");
            impar(30);
    }
    public static void impar(int diasMes){
        for (int dia=1; dia <= diasMes; dia++) { 
            if(dia % 2 != 0){ 
                System.out.println (dia);
            }
        }    
    }                        
}
