package clases;

public class diasImpares {
    /*1. Elaborar un programa en java que permita recorrer los 30 días del mes y muestre
    a los días impares.*/

   int i;
   void Monstrar_Días_Impares(){
       for (i = 1; i <=30; i++){
           if(i % 2 != 0){
               System.out.println("Día " + i + " impar");
           }
       }
   }
}
