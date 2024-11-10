package ejercicios.clase.dos;

import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int opcion;
        do {
            System.out.println("\nPrograma Calculadora");
            System.out.println("====================");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("5.- Potenciacion");
            System.out.println("6.- Salir");
            System.out.println("Ingrese Opcion ===> ");
            opcion = sc.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    potencia();
                    break;
                default:
                    System.out.println("Opcion Errada!");
            }
        } while (opcion != 6);
    }

    public static void sumar() {
        System.out.println("Operacion SUMA");
        System.out.println("==============");
        System.out.println("\nIngrese Numero 1: ");
        int numeroUno = sc.nextInt();
        System.out.println("\nIngrese Numero 2: ");
        int numeroDos = sc.nextInt();

        int resultado = numeroUno + numeroDos;
        System.out.println("\nResultado de sumar de " + numeroUno + " + " + numeroDos + " = " + resultado);
    }

    public static void restar() {
        System.out.println("Operacion RESTA");
        System.out.println("===============");
        System.out.println("\nIngrese Numero 1: ");
        int numeroUno = sc.nextInt();
        System.out.println("\nIngrese Numero 2: ");
        int numeroDos = sc.nextInt();

        int resultado = numeroUno - numeroDos;
        System.out.println("\nResultado de Restar de " + numeroUno + " - " + numeroDos + " = " + resultado);
    }

    public static void multiplicar() {
        System.out.println("Operacion MULTIPLICACION");
        System.out.println("========================");
        System.out.println("\nIngrese Numero 1: ");
        int numeroUno = sc.nextInt();
        System.out.println("\nIngrese Numero 2: ");
        int numeroDos = sc.nextInt();

        int resultado = numeroUno * numeroDos;
        System.out.println("\nResultado de Multiplicar de " + numeroUno + " X " + numeroDos + " = " + resultado);
    }

    public static void dividir() {
        System.out.println("Operacion DIVISION");
        System.out.println("==================");

        System.out.println("\nIngrese Numero 1: ");
        double numeroUno = sc.nextDouble();
        System.out.println("\nIngrese Numero 2: ");
        double numeroDos = sc.nextDouble();

        if (numeroDos == 0) {
            System.out.println("Error con Divisor, no debe ser Cero" + numeroDos);
        } else {
            double resultado = numeroUno / numeroDos;
            System.out.println("\nResultado de la Division de " + numeroUno + " / " + numeroDos + " = " + resultado);
        }
    }

    public static void potencia() {
        System.out.println("Operacion POTENCIACION");
        System.out.println("========================");
        System.out.println("\nIngrese Numero 1: ");
        int numeroUno = sc.nextInt();
        System.out.println("\nIngrese Numero 2: ");
        int numeroDos = sc.nextInt();

        int resultado = 1;
        for (int i = 1; i <= numeroDos; i++){
            resultado = resultado * numeroUno;
        }

        System.out.println("\nResultado de Elevar " + numeroUno + " al " + numeroDos + " es " + resultado);
    }
}
