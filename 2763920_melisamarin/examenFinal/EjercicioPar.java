package com.examenFinal;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioPar {
    /*
    1. Elaborar un programa que simule un retiro de cajero automatico
    -Pedir el numero de tarjeta y validar que sea numerico y de 16 numeros y pedir el nombre y apellido (4ptos)
    -Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo de cambio 4 soles. (0.5 soles)
    -Solicitar moneda de retiro (0.5 ptos) 1 soles o 2 dolares
    -Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no debe
     pasar el saldo de tarjeta y realizar la conversion si piden dolares y restar el
     saldo (8ptos)
    -luego de confirmar el retiro deben de imprimir el por pantalla el monto retirado y el monto en letras (ejemplo si
     retira 1000 deber mostrar: mil con ceros soles) y montrar el saldo y fecha y hora de transaccion (7ptos)
     */
    private static boolean validarNumeroTarjeta(String numeroTarjeta) {
        return numeroTarjeta.matches("\\d{16}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroTarjeta = "";
        while (true) {
            System.out.print("Ingrese el número de su tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.nextLine();
            if (validarNumeroTarjeta(numeroTarjeta)) {
                break;
            }
            System.out.println("Número de tarjeta inválido. Debe tener 16 dígitos numéricos.");
        }

        // Solicitar nombre y apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Constantes
        final double saldoInicial = 5500.88;
        final double tipoCambio = 4.0;
        Cuenta cuenta = new Cuenta(numeroTarjeta, nombre, apellido, saldoInicial);

        // Solicitar tipo de moneda
        System.out.println("Seleccione la moneda de retiro: 1) Soles  2) Dólares");
        int opcionMoneda = scanner.nextInt();
        double montoConvertido = 0;
        String moneda = opcionMoneda == 1 ? "soles" : "dólares";

        // Solicitar monto a retirar y validar
        double montoRetiro;
        while (true) {
            System.out.print("Ingrese el monto a retirar en " + moneda + ": ");
            montoRetiro = scanner.nextDouble();

            // Convertir monto a soles si es en dólares
            if (opcionMoneda == 2) {
                montoConvertido = montoRetiro * tipoCambio;
            } else {
                montoConvertido = montoRetiro;
            }

            if (montoRetiro > 0 && montoConvertido <= cuenta.getSaldo()) {
                cuenta.retirar(montoConvertido);
                break;
            }
            System.out.println("Monto inválido. Debe ser positivo y no exceder su saldo.");
        }

        // Imprimir resultados
        System.out.println("Monto retirado: " + NumberFormat.getCurrencyInstance(new Locale("es", opcionMoneda == 1 ? "PE" : "US")).format(montoRetiro) + " " + moneda);
        System.out.println("Monto en letras: " + NumeroALetras.convertir((int) montoRetiro) + " " + moneda);
        System.out.println("Saldo actual: " + NumberFormat.getCurrencyInstance(new Locale("es", "PE")).format(cuenta.getSaldo()));
        System.out.println("Fecha y hora de transacción: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
    }
}
