import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el primer numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Elija la operación a realizar: ");
        System.out.println("Multiplicación = 1 ");
        System.out.println("Suma = 2 ");
        System.out.println("Resta = 3  ");
        System.out.println("Division = 4 ");
        System.out.println("Residuo = 5 ");
        int operacion = scanner.nextInt();

        double resultado=0;

        if (operacion==1){
            resultado = numero1+numero2;
        } else if (operacion==2) {
            resultado = numero1-numero2;
            System.out.println("El resultado es " + resultado );
        } else if (operacion==3) {
            resultado = numero1*numero2;
            System.out.println("El resultado es " + resultado );
        } else if (operacion == 4) {
            resultado = numero1/numero2;
            System.out.println("El resultado es " + resultado );
        }else if(operacion == 5) {
            resultado = numero1 % numero2;
            System.out.println("El resultado es " + resultado);
        }else {
            System.out.println("Valor erroneo");
        }
        System.out.println("El resultado es " + resultado );
    }
}
