package com.gasolinera;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

// Wittember Jara Trebejo 2650563
public class ComprarGasolina {
    private static final double SALDO_TARJETA = 1250.44;
    // Arreglo de precios de combustible: premium, regular, diesel
    private static final double[] PRECIOS_COMBUSTIBLE = {19.40, 16.80, 9.50};
    private static final double MONTO_TANQUE_LLENO = 300.00;

    // Atributos
    private String numeroPlaca;
    private String nombre;
    private String tipoCombustible;
    private double monto;
    private String tipoPago;
    private double precioGalon;
    private double galones;
    private double montoFinal;
    private double saldoRestante;

    public void detalleCompra() {
    Scanner scanner = new Scanner(System.in);
    Pattern placaPattern = Pattern.compile("^[a-zA-Z0-9]{6}$");//6 dígitos alfanuméricos
    Pattern nombrePattern = Pattern.compile("^[a-zA-Z\\s]+$");//Solo letras y espacios



        System.out.print("Ingrese número de placa: ");
        numeroPlaca = scanner.nextLine();
        // Validar que sean 6 dígitos alfanuméricos
        while (!placaPattern.matcher(numeroPlaca).matches()) {
            System.out.print("Número de placa inválido. Ingrese nuevamente (6 dígitos alfanuméricos): ");
            numeroPlaca = scanner.nextLine();
        }



        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        // Validar que sea letras y espacios
        while (!nombrePattern.matcher(nombre).matches()) {
            System.out.print("Nombre inválido. Ingrese nuevamente: ");
            nombre = scanner.nextLine();
        }

        System.out.println("Seleccione el tipo de combustible:");
        System.out.println("1. Premium");
        System.out.println("2. Regular");
        System.out.println("3. Diesel");
    int opcionCombustible = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcionCombustible) {
        case 1:
            tipoCombustible = "premium";
            precioGalon = PRECIOS_COMBUSTIBLE[0];
            break;
        case 2:
            tipoCombustible = "regular";
            precioGalon = PRECIOS_COMBUSTIBLE[1];
            break;
        case 3:
            tipoCombustible = "diesel";
            precioGalon = PRECIOS_COMBUSTIBLE[2];
            break;
        default:
            System.out.println("Opción no válida.");
            System.exit(0);
    }

        System.out.println("Requiere tanque lleno ?");
        System.out.println("1. No");
        System.out.println("2. Si => S/300 soles");
        int opcionCarga = scanner.nextInt();
        scanner.nextLine();

        if (opcionCarga == 1) {
            System.out.print("Ingrese el monto a cargar combustible: S/  ");
            monto = scanner.nextDouble();
        } else if (opcionCarga == 2) {
            monto = MONTO_TANQUE_LLENO;
        } else {
            System.out.println("Opción no válida.");
            System.exit(0);
        }

        System.out.println("Seleccione el tipo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
    int opcionPago = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcionPago) {
        case 1:
            tipoPago = "efectivo";
            break;
        case 2:
            tipoPago = "tarjeta";
            break;
        default:
            System.out.println("Opción no válida.");
            System.exit(0);
    }

    calcularGalones();
    calcularMontoFinal();
        if (tipoPago.equals("tarjeta")) {// Si el pago es con tarjeta, actualizar el saldo
            actualizarSaldoTarjeta();
        }
}

    private void calcularGalones() {
        galones = monto / precioGalon;
    }

    private void calcularMontoFinal() {
        montoFinal = monto;
    }

    private void actualizarSaldoTarjeta() {
        saldoRestante = SALDO_TARJETA - montoFinal;
    }

    public void imprimirFactura() {
        // Formatosde fecha y hora
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("\n         Factura ");
        System.out.println("---------------------------------");
        System.out.println("Fecha y Hora: " + formatter.format(date));
        System.out.println("Placa: " + numeroPlaca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Precio por Galón: " + precioGalon + " soles");

        // Formatear a 2 decimales
        System.out.println("Cantidad : " + String.format("%.2f", galones)+ " galones");
        System.out.println("Monto Pagado: " + montoFinal + " soles");
        // Si se paga con tarjeta se mostrar el saldo restante
        if (tipoPago.equals("tarjeta")) {
            System.out.println("Saldo Restante en Tarjeta: " + saldoRestante + " soles");
        }
        System.out.println("\n---------------------------------");
        System.out.println("Gracias por su compra en Gasolinera TCS.");
        System.out.println("---------------------------------");
    }
}


