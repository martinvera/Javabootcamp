package tcs_bootcamp.service;

import tcs_bootcamp.model.Card;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CardService {

    // Enum para los tipos de moneda
    public enum Moneda {
        SOLES("1"), DOLARES("2");

        private final String valor;

        Moneda(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }

        public static Moneda fromString(String text) {
            for (Moneda m : Moneda.values()) {
                if (m.valor.equals(text)) {
                    return m;
                }
            }
            throw new IllegalArgumentException("Moneda no válida");
        }
    }

    // Constantes de saldo inicial y tipo de cambio
    private static final double SALDO_INICIAL = 5500.88;  // en soles
    private static final double TIPO_CAMBIO = 4.0;       // 1 dólar = 4 soles

    // Crear tarjeta
    public Card createCard(String cardNumber, String cardHolderName, double balance, double exchangeRate) {
        if (validateCardNumber(cardNumber) && validateCardHolderName(cardHolderName)) {
            return new Card(cardNumber, cardHolderName, balance, exchangeRate);
        } else {
            System.out.println("Número de tarjeta o nombre del titular no válido.");
            return null;
        }
    }

    // Validar número de tarjeta (16 dígitos)
    private boolean validateCardNumber(String cardNumber) {
        return cardNumber != null && cardNumber.matches("\\d{16}");
    }

    // Validar nombre del titular (nombre completo)
    private boolean validateCardHolderName(String cardHolderName) {
        return cardHolderName != null && !cardHolderName.trim().isEmpty() && cardHolderName.split(" ").length >= 2;
    }

    // Solicitar moneda de retiro
    public Moneda solicitarMoneda(Scanner consola) {
        System.out.println("Seleccione la moneda de retiro:");
        System.out.println("1. Soles");
        System.out.println("2. Dólares");
        String input = consola.nextLine();
        return Moneda.fromString(input);
    }

    // Solicitar monto a retirar
    public double solicitarMonto(Scanner consola, Card card, Moneda moneda) {
        double monto = -1;
        while (monto <= 0 || monto > card.getBalance()) {
            System.out.print("Ingrese el monto a retirar: ");
            monto = Double.parseDouble(consola.nextLine());
            if (moneda == Moneda.DOLARES) {
                monto = monto * TIPO_CAMBIO;  // Convertir dólares a soles
            }
            if (monto <= 0) {
                System.out.println("El monto debe ser mayor que 0.");
            } else if (monto > card.getBalance()) {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        }
        return monto;
    }

    // Realizar el retiro
    public boolean realizarRetiro(Card card, double monto) {
        card.setBalance(card.getBalance() - monto);
        return true;
    }

    // Convertir número a texto (en este caso solo hasta 9999 soles/dólares)
    public String convertirNumeroATexto(double monto) {
        DecimalFormat formato = new DecimalFormat("0.00");
        return formato.format(monto);
    }

    // Imprimir recibo
    public void printReceipt(Card card, double monto, Moneda moneda) {
        String montoTexto = convertirNumeroATexto(monto);
        String monedaTexto = (moneda == Moneda.SOLES) ? "soles" : "dólares";

        System.out.println("*** Recibo de Transacción ***");
        System.out.println(card.toString()); // Utiliza el toString() de la clase Card
        System.out.println("Monto retirado: " + montoTexto + " " + monedaTexto);
        System.out.println("Saldo restante: " + convertirNumeroATexto(card.getBalance()) + " soles");
        System.out.println("Fecha y hora: " + java.time.LocalDateTime.now());
    }


    // Método para crear un recibo cuando el retiro es confirmado
    public void realizarTransaccion(Card card, Scanner consola) {
        // Solicitar moneda y monto
        Moneda moneda = solicitarMoneda(consola);
        double monto = solicitarMonto(consola, card, moneda);

        // Realizar retiro
        if (realizarRetiro(card, monto)) {
            // Imprimir recibo
            printReceipt(card, monto, moneda);
        } else {
            System.out.println("No se pudo completar la transacción.");
        }
    }
}
