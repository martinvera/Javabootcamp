package TAREA2;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.iniciar();
    }

    static class Calculadora {
        private Scanner scanner = new Scanner(System.in);

        // Método principal que muestra el menú de la calculadora y realiza las operaciones
        public void iniciar() {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Potencia");

            int opcion = scanner.nextInt();

            double resultado;
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado de la división: " + resultado);
                    break;
                case 4:
                    resultado = potencia(num1, num2);
                    System.out.println("Resultado de la potencia: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        // Métodos para cada operación
        private double sumar(double a, double b) {
            return a + b;
        }

        private double restar(double a, double b) {
            return a - b;
        }

        private double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
                return 0;
            }
            return a / b;
        }

        private double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }
    }
}
