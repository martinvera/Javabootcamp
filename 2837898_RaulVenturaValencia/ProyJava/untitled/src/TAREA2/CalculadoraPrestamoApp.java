package TAREA2;
import java.util.Scanner;

public class CalculadoraPrestamoApp {
    public static void main(String[] args) {
        CalculadoraPrestamo calculadora = new CalculadoraPrestamo();
        calculadora.calcularInteresYIgv();
    }

    static class CalculadoraPrestamo {
        private static final double TASA_INTERES = 25.5;
        private static final double TASA_IGV = 18.0;
        private Scanner scanner = new Scanner(System.in);

        // Método para calcular el interés y el IGV sobre el interés
        public void calcularInteresYIgv() {
            System.out.print("Ingrese el monto del préstamo: ");
            double montoPrestamo = scanner.nextDouble();

            double interes = calcularInteres(montoPrestamo);
            double igv = calcularIgv(interes);

            System.out.println("Interés calculado (25.5%): " + interes);
            System.out.println("IGV sobre el interés (18%): " + igv);
        }

        // Método para calcular el interés
        private double calcularInteres(double monto) {
            return monto * (TASA_INTERES / 100);
        }

        // Método para calcular el IGV sobre el interés
        private double calcularIgv(double interes) {
            return interes * (TASA_IGV / 100);
        }
    }
}
