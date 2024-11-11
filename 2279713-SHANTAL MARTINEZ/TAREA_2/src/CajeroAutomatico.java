import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CajeroAutomatico {
    private static final double SALDO_INICIAL = 5500.88;
    private static final double TIPO_CAMBIO = 4.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroTarjeta;
        double saldoRestante = SALDO_INICIAL;

        // Solicitar número de tarjeta con validación de longitud exacta
        do {
            System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.nextLine();
            if (numeroTarjeta.length() != 16 || !numeroTarjeta.matches("\\d+")) {
                System.out.println("Número de tarjeta inválido. Debe contener exactamente 16 dígitos numéricos.");
            }
        } while (numeroTarjeta.length() != 16 || !numeroTarjeta.matches("\\d+"));

        // Solicitar opción de moneda
        int opcionMoneda;
        do {
            System.out.print("Seleccione moneda de retiro (1: soles, 2: dólares): ");
            opcionMoneda = scanner.nextInt();
            if (opcionMoneda != 1 && opcionMoneda != 2) {
                System.out.println("Opción inválida. Debe seleccionar 1 para soles o 2 para dólares.");
            }
        } while (opcionMoneda != 1 && opcionMoneda != 2);

        // Solicitar monto a retirar
        double montoRetiro;
        do {
            System.out.print("Ingrese el monto a retirar: ");
            montoRetiro = scanner.nextDouble();
            if (montoRetiro <= 0) {
                System.out.println("El monto debe ser mayor a cero.");
            } else if (opcionMoneda == 2) { // Si se retira en dólares, convertir a soles
                montoRetiro *= TIPO_CAMBIO;
            }
        } while (montoRetiro <= 0);

        // Validar monto de retiro y realizar conversión si es necesario
        if (montoRetiro <= SALDO_INICIAL) {
            saldoRestante -= montoRetiro;

            // Imprimir resultado del retiro
            System.out.println("Monto retirado: " + formatMonto(montoRetiro) + " soles");
            System.out.println("Monto en letras: " + convertirNumeroALetras(montoRetiro));
            // Mostrar el saldo restante
            System.out.println("Saldo restante: " + formatMonto(saldoRestante) + " soles");

            // Mostrar la fecha y hora de la transacción
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fechaActual = new Date();
            System.out.println("Fecha y hora de la transacción: " + formatter.format(fechaActual));
        } else {
            System.out.println("No hay suficiente saldo en la tarjeta para realizar el retiro.");
        }

        scanner.close();
    }

    // Método para convertir monto a letras
    public static String formatMonto(double monto) {
        NumberFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(monto);
    }

    // Método para convertir un número a letras
    public static String convertirNumeroALetras(double numero) {
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

        int entero = (int) numero;
        String letras = "";

        // Procesar cientos
        if (entero >= 100) {
            letras += centenas[entero / 100] + " ";
            entero %= 100;
        }

        // Procesar decenas
        if (entero >= 20) {
            letras += decenas[entero / 10] + " ";
            entero %= 10;
        } else if (entero >= 10) {
            switch (entero) {
                case 10: letras += "diez "; break;
                case 11: letras += "once "; break;
                case 12: letras += "doce "; break;
                case 13: letras += "trece "; break;
                case 14: letras += "catorce "; break;
                case 15: letras += "quince "; break;
                case 16: letras += "dieciséis "; break;
                case 17: letras += "diecisiete "; break;
                case 18: letras += "dieciocho "; break;
                case 19: letras += "diecinueve "; break;
            }
            entero = 0;
        }

        // Procesar unidades
        if (entero > 0) {
            letras += unidades[entero] + " ";
        }

        return letras.trim() + " soles"; // Agregar la palabra "soles"
    }
}
