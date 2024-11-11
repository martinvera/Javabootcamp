
import java.util.Scanner;

public class Tarea_Calculadora {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int opcion;
        int n1;
        int n2;
        int resultado;

        System.out.println("Elige la operación a realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("5.Potencia");
        opcion = leer.nextInt();

        System.out.println("Escribe el primer número");
        n1 = leer.nextInt();
        System.out.println("Escribe el segundo número");
        n2 = leer.nextInt();

        switch (opcion){
            case 1:
                resultado=n1+n2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 2:
                resultado=n1-n2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 3:
                resultado=n1*n2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 4:
                resultado=n1/n2;
                System.out.println("El resultado es: "+resultado);
                break;
        }




    }


}
