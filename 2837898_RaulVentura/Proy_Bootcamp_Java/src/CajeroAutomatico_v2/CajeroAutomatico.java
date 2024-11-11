package CajeroAutomatico_v2;
import java.util.ArrayList;
import java.util.Scanner;

public class CajeroAutomatico {
    private ArrayList<Transaccion> transacciones = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        Usuario usuario = registrarUsuario();
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    realizarRetiro(usuario);
                    break;
                case 2:
                    mostrarHistorialTransacciones();
                    break;
                case 3:
                    System.out.println("Gracias por usar el cajero automático.");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private Usuario registrarUsuario() {
        System.out.print("Ingrese su número de tarjeta (16 dígitos): ");
        String numeroTarjeta = scanner.next();
        while (!numeroTarjeta.matches("\\d{16}")) {
            System.out.print("Número inválido. Ingrese su número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.next();
        }

        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();

        return new Usuario(numeroTarjeta, nombreCompleto, 5500.88);
    }

    private void mostrarMenu() {
        System.out.println("\n1. Retiro");
        System.out.println("2. Ver historial de transacciones");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void realizarRetiro(Usuario usuario) {
        System.out.print("Ingrese la moneda (soles/dolares): ");
        String moneda = scanner.next();
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();

        if (monto > 0) {
            Retiro retiro = new Retiro(usuario);
            retiro.realizarTransaccion(monto, moneda);
            transacciones.add(retiro);
        } else {
            System.out.println("Monto inválido. Debe ser mayor que cero.");
        }
    }

    private void mostrarHistorialTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones realizadas.");
        } else {
            for (Transaccion transaccion : transacciones) {
                System.out.println("Transacción en: " + Utilidades.formatoFecha(transaccion.getFechaHora()));
            }
        }
    }
}
