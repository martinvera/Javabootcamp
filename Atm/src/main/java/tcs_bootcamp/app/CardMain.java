package tcs_bootcamp.app;

import tcs_bootcamp.model.Card;
import tcs_bootcamp.service.CardService;
//import tcs_bootcamp.model.Moneda;

import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        cardMenu();
    }

    public static void cardMenu() {
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        CardService cardService = new CardService();

        System.out.println("*** Bienvenido al Cajero Automatico TCS ***");

        Card tarjeta = null; // Inicializamos la tarjeta como nula
        while (!salir) {
            try {
                int opcion = mostrarMenu(consola);

                switch (opcion) {
                    case 1: // Crear tarjeta
                        tarjeta = crearTarjeta(consola, cardService);
                        break;

                    case 2: // Tipo de moneda de retiro
                        if (tarjeta == null) {
                            System.out.println("Primero debes crear una tarjeta.");
                        } else {
                            CardService.Moneda moneda = seleccionarMoneda(consola);
                            System.out.println("Moneda seleccionada: " + moneda);
                        }
                        break;
//
                    case 3: // Monto a retirar
                        if (tarjeta == null) {
                            System.out.println("Primero debes crear una tarjeta.");
                        } else {
                            procesarRetiro(consola, tarjeta, cardService);
                        }
                        break;

                    case 4: // Salir
                        salir = true;
                        System.out.println("Gracias por usar el Cajero Automático TCS.");
                        break;

                    default:
                        System.out.println("Opción no válida, por favor intente nuevamente.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.println("""
                Menú:
                1. Crear tarjeta
                2. Tipo de moneda de retiro
                3. Monto a retirar
                4. Salir
                Elige una opción: """);
        return Integer.parseInt(consola.nextLine()); // Leemos la opción seleccionada
    }

    private static Card crearTarjeta(Scanner consola, CardService cardService) {
        System.out.println("Ingrese el número de tarjeta (16 dígitos): ");
        String numeroTarjeta = consola.nextLine();

        System.out.println("Ingrese el nombre completo del titular de la tarjeta: ");
        String nombreTitular = consola.nextLine();

        // Guardar en constantes el saldo inicial y tipo de cambio
        double saldoInicial = 5500.88;
        double tipoCambio = 4.0; // 1 USD = 4 soles

        // Crear la tarjeta utilizando el CardService, que valida el número de tarjeta y nombre
        Card tarjeta = cardService.createCard(numeroTarjeta, nombreTitular, saldoInicial, tipoCambio);
        if (tarjeta != null) {
            System.out.println("Tarjeta creada exitosamente.");
        }
        return tarjeta;
    }
    private static CardService.Moneda seleccionarMoneda(Scanner consola) {
        System.out.println("Seleccione la moneda de retiro:");
        System.out.println("1. Soles (SOLES)");
        System.out.println("2. Dólares (DÓLARES)");

        int opcionMoneda = Integer.parseInt(consola.nextLine());
        switch (opcionMoneda) {
            case 1:
                return CardService.Moneda.SOLES;
            case 2:
                return CardService.Moneda.DOLARES;
            default:
                System.out.println("Opción no válida, se seleccionarán soles por defecto.");
                return CardService.Moneda.SOLES;
        }
    }
    private static void procesarRetiro(Scanner consola, Card tarjeta, CardService cardService) {
        System.out.println("Ingrese el monto a retirar: ");
        double montoRetiro = Double.parseDouble(consola.nextLine());

        if (montoRetiro <= 0) {
            System.out.println("El monto debe ser mayor a cero.");
            return;
        }

        if (montoRetiro > tarjeta.getBalance()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        // Preguntar por la moneda
        CardService.Moneda moneda = seleccionarMoneda(consola);

        if (moneda == CardService.Moneda.DOLARES) {
            montoRetiro = montoRetiro * tarjeta.getExchangeRate(); // Convertir a soles si es dólar
        }

        tarjeta.setBalance(tarjeta.getBalance() - montoRetiro); // Restar el saldo

        cardService.printReceipt(tarjeta, montoRetiro, moneda); // Imprimir el recibo de la transacción
    }


}