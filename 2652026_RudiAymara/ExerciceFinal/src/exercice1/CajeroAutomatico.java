package exercice1;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Usar las constantes desde la clase Configuracion
        double saldo = Configuracion.SALDO_INICIAL;
        double tipoCambio = Configuracion.TIPO_CAMBIO;

        Scanner scanner = new Scanner(System.in);

        // Crear el patrón para 16 dígitos
        Pattern pattern = Pattern.compile("\\d{16}");

        // Validar número de tarjeta
        String numeroTarjeta;
        int intentos = 0;


        while (intentos < 4) {
            System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.nextLine();
            Matcher matcher = pattern.matcher(numeroTarjeta);

            if (matcher.matches()) { // Verificar coincidencia
                break;
            } else {
                intentos++; // Incrementar  intentos fallidos
                System.out.println("Número de tarjeta inválido. Debe tener 16 dígitos.");

                if (intentos == 4) {
                    System.out.println("Demasiados intentos fallidos. El programa se cerrará.");
                    System.exit(0); //Terminar el programa
                }
            }
        }

        // Pedir nombre y apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Solicitar moneda de retiro
        Moneda opcionMoneda;

        while (true) {
            System.out.println("Seleccione la moneda de retiro:");
            System.out.println("1. Soles");
            System.out.println("2. Dólares");
            System.out.print("Opción: ");
            String opcion = scanner.next();

            try {
                opcionMoneda = Moneda.from(opcion);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Muestra la moneda seleccionada
        System.out.println("Moneda seleccionada: " + opcionMoneda);


        // Solicitar monto a retirar
        double montoRetiro;
        while (true) {
            System.out.print("Ingrese el monto a retirar: ");
            montoRetiro = scanner.nextDouble();

            if (montoRetiro <= 0) {
                System.out.println("El monto debe ser mayor a cero.");
            } else if (opcionMoneda == Moneda.SOLES && montoRetiro > saldo) {
                System.out.println("Fondos insuficientes.");
            } else if (opcionMoneda == Moneda.DOLARES && montoRetiro * tipoCambio > saldo) {
                System.out.println("Fondos insuficientes.");
            } else {
                break;
            }
        }

        // Convertir y descontar el saldo según la moneda seleccionada
        double montoRetirado = (opcionMoneda == Moneda.SOLES) ? montoRetiro : montoRetiro * tipoCambio;
        saldo -= montoRetirado;

        // Mostrar detalles de la transacción

        String sb = "\n--- Resumen de la Transacción ---\n" +
                "Nombre: " + nombre + " " + apellido + "\n" +
                "Monto retirado: " + formatoMoneda(montoRetirado) +
                " (" + NumeroALetras.numeroALetras(montoRetirado) + " nuevos soles)" + "\n" +
                "Saldo restante: " + formatoMoneda(saldo) + " (" + NumeroALetras.numeroALetras(saldo) + " nuevos soles)" + "\n" +
                "Fecha y hora de la transacción: " + FechaHora.obtenerFechaHoraActual("America/Lima") + "\n";

        System.out.println(sb);
    }
    // Formatear monto a dos decimales
    private static String formatoMoneda(double monto) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        return formato.format(monto);
    }
}
