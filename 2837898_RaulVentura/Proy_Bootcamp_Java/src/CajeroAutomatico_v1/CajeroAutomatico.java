package CajeroAutomatico_v1;
import java.util.Scanner;

public class CajeroAutomatico {
    private static final double SALDO_INICIAL = 5500.88;
    private static final double TIPO_DE_CAMBIO = 4.0;
    private double saldo = SALDO_INICIAL;
    private Scanner scanner = new Scanner(System.in);

    public void iniciarTransaccion() {
        String numeroTarjeta = solicitarNumeroTarjeta();
        String nombreCompleto = solicitarNombreCompleto();

        System.out.println("Seleccione la moneda de retiro: 1. Soles  2. Dólares");
        int moneda = scanner.nextInt();

        double monto = solicitarMontoRetiro();
        if (validarMonto(monto, moneda)) {
            realizarRetiro(monto, moneda);
        }
    }

    private String solicitarNumeroTarjeta() {
        System.out.print("Ingrese su número de tarjeta (16 dígitos): ");
        String numeroTarjeta = scanner.next();
        while (!Validaciones.validarNumeroTarjeta(numeroTarjeta)) {
            System.out.print("Número inválido. Ingrese su número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.next();
        }
        return numeroTarjeta;
    }

    private String solicitarNombreCompleto() {
        System.out.print("Ingrese su nombre y apellido: ");
        scanner.nextLine(); // Consumir la línea anterior
        return scanner.nextLine();
    }

    private double solicitarMontoRetiro() {
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();
        while (monto <= 0) {
            System.out.print("Monto inválido. Ingrese un monto mayor a cero: ");
            monto = scanner.nextDouble();
        }
        return monto;
    }

    private boolean validarMonto(double monto, int moneda) {
        double montoConvertido = (moneda == 2) ? monto * TIPO_DE_CAMBIO : monto;
        if (montoConvertido > saldo) {
            System.out.println("Fondos insuficientes. Su saldo es: " + saldo);
            return false;
        }
        return true;
    }

    private void realizarRetiro(double monto, int moneda) {
        double montoRetirado = (moneda == 2) ? monto * TIPO_DE_CAMBIO : monto;
        saldo -= montoRetirado;

        System.out.println("Monto retirado: " + montoRetirado + (moneda == 1 ? " soles" : " dólares"));
        System.out.println("Monto en letras: " + Conversor.convertirNumeroALetras(montoRetirado) + " " + (moneda == 1 ? "soles" : "dólares"));
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Fecha y hora de la transacción: " + Utilidades.obtenerFechaYHora());
    }
}
