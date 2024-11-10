package proyectofinal;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//2018580 Cinthia Rojas
public class CajeroAutomatico {
    /* Elaborar un programa que simule un retiro de cajero automatico:
       -Pedir el numero de tarjeta y validar que sea numerico y de 16 numeros y pedir el nombre y apellido (4ptos)
       -Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo de cambio 4 soles. (0.5 soles)
       -Solicitar moneda de retiro (0.5 ptos) 1 soles o 2 dolares
       -Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no debe pasar el saldo de tarjeta y
        realizar la conversion si piden dolares y restar el saldo (8ptos)
       -luego de confirmar el retiro deben de imprimir el por pantalla el monto retirado y el monto en letras
        (ejemplo si retira 1000 deber mostrar: mil con ceros soles) y montrar el saldo y fecha y hora de transaccion (7ptos)*/


    // Constantes
private static final double SALDO_INICIAL = 5500.88;
private static final double TIPO_DE_CAMBIO = 4.0;
private static double saldo = SALDO_INICIAL;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numeroTarjeta = "";
    int opcionMoneda = 0;
    double montoRetiro = 0;

    // Paso 1: Pedir el número de tarjeta y validarlo
    numeroTarjeta = solicitaTarjeta(scanner);
    // Paso 2: Pedir nombre y apellido
    System.out.print("Ingrese su nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese su apellido: ");
    String apellido = scanner.nextLine();
    // Paso 3: Solicitar moneda de retiro
    System.out.println("Seleccione la moneda de retiro: ");
    System.out.println(" 1. Soles");
    System.out.println(" 2. Dólares");
    opcionMoneda = scanner.nextInt();
    scanner.nextLine();
    // Paso 4: Solicitar monto de retiro
    montoRetiro = solicitarMonto(scanner);
    // Paso 5: Realizar el retiro
    realizarRetiro(montoRetiro, opcionMoneda);
    // Paso 6: Mostrar detalles de la transacción
    imprimirDetallesTransaccion(montoRetiro, opcionMoneda, numeroTarjeta, nombre, apellido);
    scanner.close();
}
private static String solicitaTarjeta(Scanner scanner) {
    String nrotarjeta = "";
    boolean entradaValida = false;
    while (entradaValida == false) {
        System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
        nrotarjeta = scanner.nextLine();
        if (nrotarjeta.matches("\\d{16}")) {// Verifica si el string es de 16 dígitos y numérico
             entradaValida = true;
        }
        else {
            System.out.println("Error: Entrada no válida. Debe ingresar 16 dígitos numéricos.");
        }
    }
    // Formatear el número de tarjeta
    nrotarjeta = nrotarjeta.replaceAll("(\\d{4})(?=\\d)", "$1-");
    return nrotarjeta;
}
private static double solicitarMonto(Scanner scanner) {
    double monto = -1;
    boolean entradaValida = false;
    while (!entradaValida)
    {
        System.out.print("Ingrese el monto a retirar: ");
        if (scanner.hasNextDouble()) { // Verifica si la entrada es un número decimal
             monto = scanner.nextDouble();
             scanner.nextLine(); // Limpiar el buffer
             if (monto <= 0) {
                 System.out.println("El monto debe ser mayor a cero. Intente de nuevo.");
             }
             else if (monto > saldo) {
                 System.out.println("El monto no debe ser mayor a su saldo disponible.");
             }
             else {
                 entradaValida = true;
             }
        }
        else {
            System.out.println("Error: Entrada no válida. Debe ingresar un número.");
            scanner.nextLine(); // Limpiar la entrada no válida
            }
    }
    return monto;
}

// Función para realizar el retiro
private static void realizarRetiro(double montoRetiro, int opcionMoneda) {
    double montoEnSoles = 0;
    if (opcionMoneda == 1) {
        montoEnSoles = montoRetiro;
    } else {
        montoEnSoles = montoRetiro * TIPO_DE_CAMBIO;
    }
    saldo = saldo - montoEnSoles;

}
// Función para imprimir los detalles de la transacción
private static void imprimirDetallesTransaccion(double montoRetiro, int opcionMoneda, String numeroTarjeta, String nombre, String apellido) {
    double montoEnSoles = 0;
    if(opcionMoneda == 1) {
        montoEnSoles=montoRetiro;
    }else{
        montoEnSoles=montoRetiro * TIPO_DE_CAMBIO;
    }
    System.out.println(" ");
    System.out.println("----Validacion Conforme----");
    System.out.println("Número de tarjeta: " + numeroTarjeta);
    System.out.println("Saldo actual: " + SALDO_INICIAL);
    System.out.println("Nombre del cliente: " + nombre + " " + apellido);
    System.out.println("Monto retirado: " + montoRetiro);
    System.out.println("Monto en letras: " + convertirNumeroALetras((int) montoEnSoles) + " con " + (int) ((montoEnSoles - (int) montoEnSoles) * 100) + " céntimos soles");
    System.out.println("Saldo restante: " + saldo);

    // Mostrar la fecha y hora de la transacción
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println("Fecha y hora de la transacción: " + formatoFecha.format(new Date()));
}
// Método para convertir números a letras (simplificado)
public static String convertirNumeroALetras(int numero) {
    String[] UNIDADES = {
            "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
    };
    String[] DIEZ_A_DIECINUEVE = {
            "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
    };
    String[] DECENAS = {
            "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };
    String[] CENTENAS = {
            "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
    };

    if (numero == 0) {
        return "cero";
    }
    if (numero == 100) {
        return "cien";
    }
    StringBuilder resultado = new StringBuilder();

    // Manejo de números en el rango de mil a 999,999
    if (numero >= 1000) {
        int miles = numero / 1000;
        resultado.append(miles > 1 ? convertirNumeroALetras(miles) + " mil " : "mil ");
        numero %= 1000;
    }
    // Manejo de centenas
    if (numero >= 100) {
        int centenas = numero / 100;
        resultado.append(CENTENAS[centenas]).append(" ");
        numero %= 100;
    }

    //Manejo de decenas y unidades
    if (numero >= 20) {
        int decenas = numero / 10;
        resultado.append(DECENAS[decenas]);
        numero %= 10;
        if (numero > 0) {
            resultado.append(" y ").append(UNIDADES[numero]);
        }
    }
    else if (numero >= 10) {
        resultado.append(DIEZ_A_DIECINUEVE[numero - 10]);
    }
    else if (numero > 0) {
        resultado.append(UNIDADES[numero]);
    }
    return resultado.toString().trim();
}
}
