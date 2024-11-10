import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Elaborar un programa en java que simule una calculadora para sumar, restar, dividir y calcular la potencias.

        //Se puede utilizar el enum.
        Scanner scanner = new Scanner(System.in);
        //Se solicita ingresen una opcion
        System.out.println("Ingrese la opción");


        for (OpcionCalculadora opcion : OpcionCalculadora.values()) {
            System.out.println( opcion.getNumero() + ". "+ opcion);
        }

        int valOpcion = scanner.nextInt();
        //OpcionCalculadora opcion = O

        if (valOpcion >= 1 && valOpcion <= OpcionCalculadora.values().length) {

            OpcionCalculadora opcion = OpcionCalculadora.values()[valOpcion-1];
            System.out.println("Ingrese el primer número");

            double numero1;
            double numero2;

            numero1= scanner.nextDouble();
            System.out.println("Ingrese el segundo número");
            numero2= scanner.nextDouble();

            double resultado =0.00;

            switch (opcion){
                case SUMAR:  //suma
                    resultado=numero1+numero2;

                    break;
                case RESTAR:  //resta
                    resultado=numero1-numero2;

                    break;
                case MULTIPLICAR: //multiplicar
                    resultado=numero1*numero2;

                    break;
                case DIVIDIR: //dividir
                    if (numero2!=0.00){
                        resultado= numero1/numero2;

                    }else {
                        System.out.println("Numero2 no valido");
                    }
                    break;
                case POTENCIA: //potencia
                    resultado= Math.pow(numero1, numero2);

                    break;
                default:
                    System.out.println("Operación no valida");
                    break;
            }
            System.out.println("El Resultado de la operacion " + opcion + " es: "+ resultado);
        }else{
            System.out.println("Índice fuera de rango.");
        }


    }
}
