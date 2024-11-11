package com.trabajo.Final;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.trabajo.Final.Tarjeta.TIPO_CAMBIO;

public class Ingreso {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tarjeta tarjetaTitular = new Tarjeta();
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Ingrese Nombre y Apellido:");
        String nombreapellido = scanner.nextLine();

        String numeroDeTarjeta = solicitarNumeroDeTarjeta(tarjetaTitular);
        if (numeroDeTarjeta == null) {
            System.out.println("Error en el Numero de Tarjeta");
            return;
        }


        System.out.println("Bienvenido " + nombreapellido + " su Saldo Inicial es " + tarjetaTitular.obtenerSaldo() );
        System.out.println("Tipo  Cambio  " + TIPO_CAMBIO );

        boolean realizarOtroRetiro = true;

        while (realizarOtroRetiro) {
            int numMoneda = seleccionarMoneda(tarjetaTitular);
            if (numMoneda == -1) {
                System.out.println("Error en la moneda seleccionada");
                break;
            }

            double importeRetiro = ingresarImporte(tarjetaTitular, numMoneda);
            if (importeRetiro == -1) {
                System.out.println("Error en el monto ingresado");
                break;
            }

            tarjetaTitular.textoRetiro(tarjetaTitular.kantidad);

            System.out.println("El importe retirado fue " + tarjetaTitular.varcantidad + " " + tarjetaTitular.valmoneda + " (" + tarjetaTitular.words + " y " + tarjetaTitular.decimalPartString + "/100 Soles)");
            System.out.println("Ahora tiene : " + tarjetaTitular.obtenerSaldo());
            System.out.println(dateFormat.format(date));

            realizarOtroRetiro = preguntarSiOtroRetiro();
        }

    }

    private static String solicitarNumeroDeTarjeta(Tarjeta tarjetaTitular) {
        while (true) {
            System.out.println("Ingrese Numero de Tarjeta:");
            String numeroDeTarjeta = scanner.nextLine();

            if (numeroDeTarjeta.equalsIgnoreCase("x")) {
                return null;  // Salir si el usuario pulsa 'x'
            }

            tarjetaTitular.validarLongitud(numeroDeTarjeta);
            if (tarjetaTitular.respuesta1 == 1) {
                return numeroDeTarjeta;  // Número de tarjeta válido
            } else {
                System.out.println("Número de tarjeta inválido. Debe tener 16 caracteres. Inténtelo de nuevo o pulse 'x' para salir.");
            }
        }
    }


    private static int seleccionarMoneda(Tarjeta tarjetaTitular) {
        while (true) {
            System.out.println("Seleccione Moneda: 1 (Soles) || 2 (Dolares)");
            int numMoneda = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            tarjetaTitular.validarMoneda(numMoneda);
            if (tarjetaTitular.respuesta2 == 1) {
                return numMoneda;  // Moneda válida
            } else {
                System.out.println("Moneda inválida. Inténtelo de nuevo o pulse 'x' para salir.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("x")) {
                    return -1;  // Salir si el usuario pulsa 'x'
                }
            }
        }
    }
    private static double ingresarImporte(Tarjeta tarjetaTitular, int numMoneda ) {
        while (true) {
            System.out.println("Ingrese Importe a retirar" );
            double importeRetiro = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // char valorm = (char) (numMoneda + '0');
            if (importeRetiro != 0) {
                tarjetaTitular.sacarEfectivo(numMoneda, importeRetiro);
                if (tarjetaTitular.respuesta3 == 1) {
                    return tarjetaTitular.kantidad;  // Moneda válido
                } else {
                    System.out.println("Error en el importe ingresado. Inténtelo de nuevo o pulse 'x' para salir.");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("x")) {
                        return -1;  // Salir si el usuario pulsa 'x'
                    }
                }
            } else {
                return -1;  // Salir si el usuario pulsa '0'
            }

        }
    }
    private static boolean preguntarSiOtroRetiro() {
        while (true) {
            System.out.println("¿Desea realizar otro retiro? (s/n)");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals("s")) {
                return true;
            } else if (respuesta.equals("n")) {
                return false;
            } else {
                System.out.println("Respuesta inválida. Por favor, ingrese 's' para sí o 'n' para no.");
            }
        }
    }
}
