package tcs.gasstation;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class GasStationService {

    private static final double SALDO_TARJETA = 1250.44;
    private static final double[] PRECIO_COMBUSTIBLES = {19.40, 16.80, 9.50};

    private final Scanner scanner = new Scanner(System.in);

    public void procesarCompra() {
        // Solicitar datos del cliente
        String placa = solicitarPlaca();
        String nombres = solicitarNombre();
        String tipoCombustible = solicitarTipoCombustible();
        double precioCombustible = obtenerPrecioCombustible(tipoCombustible);
        double montoCarga = solicitarMontoCarga();
        String tipoPago = solicitarTipoPago();

        // Calcular la cantidad de galones
        double cantidadGalones = montoCarga / precioCombustible;

        // Procesar el pago y actualizar el saldo si es con tarjeta
        double saldoActualizado = SALDO_TARJETA;
        if ("tarjeta".equalsIgnoreCase(tipoPago)) {
            if (montoCarga > SALDO_TARJETA) {
                System.out.println("Saldo insuficiente en la tarjeta.");
                return;
            }
            saldoActualizado -= montoCarga;
        }

        // Obtener fecha y hora actual
        String fechaHora = obtenerFechaHoraActual();

        // Imprimir el recibo de compra
        imprimirRecibo(placa, nombres, tipoCombustible, precioCombustible, cantidadGalones, montoCarga, fechaHora, saldoActualizado);
    }

    // Solicitar el número de placa
    private String solicitarPlaca() {
        String placa;
        do {
            System.out.print("Ingrese el número de placa (6 caracteres alfanuméricos): ");
            placa = scanner.nextLine();
        } while (placa.length() != 6 || !placa.matches("[a-zA-Z0-9]+"));
        return placa;
    }

    // Solicitar los nombres del cliente
    private String solicitarNombre() {
        System.out.print("Ingrese sus nombres completos: ");
        return scanner.nextLine();
    }

    // Solicitar el tipo de combustible
    private String solicitarTipoCombustible() {
        String tipoCombustible;
        do {
            System.out.print("Ingrese el tipo de combustible (premium, regular o diesel): ");
            tipoCombustible = scanner.nextLine().toLowerCase();
        } while (!tipoCombustible.equals("premium") && !tipoCombustible.equals("regular") && !tipoCombustible.equals("diesel"));
        return tipoCombustible;
    }

    // Obtener el precio del combustible según el tipo
    private double obtenerPrecioCombustible(String tipoCombustible) {
        return switch (tipoCombustible) {
            case "premium" -> PRECIO_COMBUSTIBLES[0];
            case "regular" -> PRECIO_COMBUSTIBLES[1];
            case "diesel" -> PRECIO_COMBUSTIBLES[2];
            default -> 0;
        };
    }

    // Solicitar el monto de carga en soles o tanque lleno
    private double solicitarMontoCarga() {
        while (true) {
            System.out.print("Ingrese el monto de carga en soles o 'tanque lleno' para cargar 300 soles: ");
            String montoInput = scanner.nextLine().toLowerCase();
            if (montoInput.equals("tanque lleno")) {
                return 300;
            }
            try {
                double monto = Double.parseDouble(montoInput);
                if (monto > 0) return monto;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }
    }

    // Solicitar el tipo de pago
    private String solicitarTipoPago() {
        String tipoPago;
        do {
            System.out.print("Ingrese el tipo de pago (efectivo o tarjeta): ");
            tipoPago = scanner.nextLine().toLowerCase();
        } while (!tipoPago.equals("efectivo") && !tipoPago.equals("tarjeta"));
        return tipoPago;
    }

    // Obtener la fecha y hora actual en formato adecuado
    private String obtenerFechaHoraActual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    // Método para convertir un monto a letras (simplificado)
    private String convertirNumeroALetras(double monto) {
        int parteEntera = (int) monto;
        int parteDecimal = (int) Math.round((monto - parteEntera) * 100);

        return convertirNumeroALetras(parteEntera) + " con " + parteDecimal + "/100 soles";
    }

    private String convertirNumeroALetras(int numero) {
        if (numero == 0) {
            return "cero";
        }

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

        StringBuilder resultado = new StringBuilder();

        if (numero >= 1000000) {
            int millones = numero / 1000000;
            resultado.append(convertirNumeroALetras(millones)).append(" millón");
            if (millones > 1) {
                resultado.append("es");
            }
            numero %= 1000000;
        }

        if (numero >= 1000) {
            int miles = numero / 1000;
            if (miles == 1) {
                resultado.append(" mil");
            } else {
                resultado.append(" ").append(convertirNumeroALetras(miles)).append(" mil");
            }
            numero %= 1000;
        }

        if (numero >= 100) {
            int centenasPos = numero / 100;
            if (centenasPos == 1 && numero % 100 == 0) {
                resultado.append(" cien");
            } else {
                resultado.append(" ").append(centenas[centenasPos]);
            }
            numero %= 100;
        }

        if (numero >= 20) {
            int decenasPos = numero / 10;
            resultado.append(" ").append(decenas[decenasPos]);
            numero %= 10;
            if (numero > 0) {
                resultado.append(" y ").append(unidades[numero]);
            }
        } else if (numero >= 10) {
            resultado.append(" ").append(especiales[numero - 10]);
        } else if (numero > 0) {
            resultado.append(" ").append(unidades[numero]);
        }

        return resultado.toString().trim();
    }

    // Imprimir el recibo de compra
    private void imprimirRecibo(String placa, String nombres, String tipoCombustible, double precioCombustible,
                                double cantidadGalones, double montoCarga, String fechaHora, double saldoActualizado) {

        // Convertir el monto a texto
        String montoEnLetras = convertirNumeroALetras(montoCarga);

        System.out.println("\n--- Recibo de Compra ---");
        System.out.println("Placa: " + placa);
        System.out.println("Nombres: " + nombres);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Tipo de Combustible: " + tipoCombustible.substring(0, 1).toUpperCase() + tipoCombustible.substring(1));
        System.out.println("Precio Unitario: S/" + String.format("%.2f", precioCombustible));
        System.out.println("Cantidad de Galones: " + String.format("%.2f", cantidadGalones));
        System.out.println("Monto Final: S/" + String.format("%.2f", montoCarga));
        System.out.println("Monto en Letras: " + montoEnLetras);
        System.out.println("Saldo en Tarjeta: S/" + String.format("%.2f", saldoActualizado));
    }
}
