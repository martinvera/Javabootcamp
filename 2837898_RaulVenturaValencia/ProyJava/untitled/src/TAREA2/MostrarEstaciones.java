package TAREA2;
import java.util.Scanner;

public class MostrarEstaciones {
    public static void main(String[] args) {
        Estaciones estaciones = new Estaciones();
        estaciones.mostrarEstacionPorMes();
    }
}

class Estaciones {
    private Scanner scanner = new Scanner(System.in);

    // Método para solicitar el mes al usuario y mostrar la estación correspondiente
    public void mostrarEstacionPorMes() {
        System.out.print("Ingrese un número de mes (1 a 12): ");
        int mes = scanner.nextInt();

        String estacion = obtenerEstacion(mes);
        if (estacion != null) {
            System.out.println("La estación del año para el mes " + mes + " es: " + estacion);
        } else {
            System.out.println("Mes inválido. Por favor ingrese un número entre 1 y 12.");
        }
    }

    // Método que devuelve la estación correspondiente a cada mes
    private String obtenerEstacion(int mes) {
        switch (mes) {
            case 9: case 10: case 11:
                return "Primavera";
            case 12: case 1: case 2:
                return "Verano";
            case 3: case 4: case 5:
                return "Otoño";
            case 6: case 7: case 8:
                return "Invierno";
            default:
                return null; // Retorna null si el mes no está entre 1 y 12
        }
    }
}
