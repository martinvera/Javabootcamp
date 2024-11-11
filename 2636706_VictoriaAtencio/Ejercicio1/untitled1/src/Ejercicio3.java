import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Se puede utilizar el enum.
        Scanner scanner = new Scanner(System.in);
        //Se solicita ingresen una opcion
        System.out.println("Ingrese la opción");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");

        int opcion = scanner.nextInt();
        System.out.println("Ingrese el primer número");

        double numero1= scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        double numero2= scanner.nextDouble();

        double resultado =0.00;

        switch (opcion){
            case 1: //suma
                resultado=numero1+numero2;

                break;
            case 2: //resta
                resultado=numero1-numero2;

                break;
            case 3: //multiplicar
                resultado=numero1*numero2;

                break;
            case 4: //dividir
                if (numero2!=0){
                    resultado= numero1/numero2;

                }else {
                    System.out.println("Numero2 no valido");
                }
                break;
            case 5: //potencia
                resultado= Math.pow(numero1, numero2);

                break;
            default:
                System.out.println("Operación no valida");
                break;
        }
        System.out.println("Resultado" + resultado);
    }


}
