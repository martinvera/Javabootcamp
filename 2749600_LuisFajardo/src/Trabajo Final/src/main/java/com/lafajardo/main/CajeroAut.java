package com.lafajardo.main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import com.lafajardo.modelo.Cuenta;
import com.lafajardo.modelo.Transaccion;
import com.lafajardo.util.ConversorMoneda;
import com.lafajardo.util.Validacion;

public class CajeroAut extends Transaccion {

    private static final BigDecimal TIPO_DE_CAMBIO = new BigDecimal("4.00");

    public static void main(String[] args) {
        CajeroAut cajero = new CajeroAut();
        cajero.iniciar();
    }

    // Inicia la transacción del cajero
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Cajero TCS, creemos en tu crecimiento!");

        // Pide número tarjeta y nombre del usuario
        String numTarjeta = obtenerNumTarjeta(scanner);
        String nombreCompleto = obtenerNombreCompleto(scanner);

        // Crea cuenta con saldo inicial
        Cuenta cuenta = new Cuenta(new BigDecimal("5500.88"));

        // Solicita tipo de moneda
        int opcionMoneda = obtenerOpcionMoneda(scanner);

        // Solicita monto del retiro
        BigDecimal monto = obtenerImporteRetiro(scanner, cuenta, opcionMoneda);

        // Crea un conversor genérico
        ConversorMoneda conversor = new ConversorMoneda();

        // Procesa el retiro
        BigDecimal montoConvertido = opcionMoneda == 2 ? conversor.convertir(monto, TIPO_DE_CAMBIO) : monto;

        if (cuenta.retirar(montoConvertido)) {
            imprimirRecibo(nombreCompleto, numTarjeta, monto, cuenta);
        } else {
            System.out.println("Lo sentimos no cuenta con saldo suficiente. No se pudo realizar el retiro");
        }

        scanner.close();
    }

    private String obtenerNumTarjeta(Scanner scanner) {
        System.out.print("Ingrese los 16 digitos de su Tarjeta de Crédito: ");
        String numeroTarjeta = scanner.nextLine();
        while (!Validacion.esNumeroDeTarjetaValido(numeroTarjeta)) {
            System.out.println("Error, número de Tarjeta debe tener 16 digitos(solo números)");
            System.out.print("Por favor, ingrese su número de tarjeta: ");
            numeroTarjeta = scanner.nextLine();
        }
        // Enmascara todos los dígitos excepto los últimos cuatro
        String numeroEnmascarado = "**** **** **** " + numeroTarjeta.substring(12);
        return numeroEnmascarado;
    }

    //Metodo para nombre y apellido.
    private String obtenerNombreCompleto(Scanner scanner) {
        String nombre;
        String apellido;

        while (true) {
            System.out.print("Ingrese su nombre (al menos 2 letras): ");
            nombre = scanner.nextLine().trim();

            // Valida longitud y caracteres permitidos
            if (!Validacion.validarNombreOApellido(nombre, "nombre", 7)) {
                continue;
            }

            System.out.print("Ingrese su apellido (al menos 2 letras): ");
            apellido = scanner.nextLine().trim();

            if (!Validacion.validarNombreOApellido(apellido, "apellido", 7)) {
                continue;
            }

            // Convierte nombre y apellido a mayúsculas
            nombre = nombre.toUpperCase();
            apellido = apellido.toUpperCase();

            break;
        }
        return nombre + " " + apellido;
    }



    private int obtenerOpcionMoneda(Scanner scanner) {
        System.out.println("Escoja la moneda en la que desea realizar el retiro:");
        System.out.println("1 - Soles");
        System.out.println("2 - Dólares");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        while (opcion != 1 && opcion != 2) {
            System.out.println("Opción inválida. Debe elegir 1 para soles o 2 para dólares");
            System.out.print("Seleccione la moneda en la que desea realizar el retiro: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }

    private BigDecimal obtenerImporteRetiro(Scanner scanner, Cuenta cuenta, int opcionMoneda) {
        BigDecimal importe;

        while (true) {
            System.out.print("Por favor, indique el importe que desea retirar: ");

            try {
                importe = scanner.nextBigDecimal();

                // Validar que el importe sea mayor que cero y no exceda el saldo
                if (importe.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("El importe debe ser mayor a cero. Inténtelo de nuevo.");
                } else if (importe.compareTo(cuenta.getSaldo()) > 0) {
                    System.out.println("El importe excede el saldo actual de la cuenta. Inténtelo de nuevo.");
                } else {
                    // Importe válido
                    return importe.setScale(2, RoundingMode.HALF_UP); // Redondeo a 2 decimales si es necesario
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpia la entrada inválida para evitar un bucle infinito
            }
        }
    }
}




