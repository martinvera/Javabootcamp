import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Introduce el primer numero: ");

        double primerNumero = scanner.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Seleccione la operacion:");
        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.println("3 Dividir");
        System.out.println("4 Potencia");

        int opcion = scanner.nextInt();
        double resultadoOperacion;

        switch (opcion) {
            case 1:
                resultadoOperacion = primerNumero + segundoNumero;
                System.out.println("Resultado de la suma: " + resultadoOperacion);
                break;
            case 2:
                resultadoOperacion = primerNumero - segundoNumero;
                System.out.println("Resultado de la resta: " + resultadoOperacion);
                break;
            case 3:
                if (segundoNumero != 0) {
                    resultadoOperacion = primerNumero / segundoNumero;
                    System.out.println("Resultado de la división: " + resultadoOperacion);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 4:
                resultadoOperacion = Math.pow(primerNumero, segundoNumero);
                System.out.println("Resultado de la potencia: " + resultadoOperacion);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
        scanner.close();
    }
}
