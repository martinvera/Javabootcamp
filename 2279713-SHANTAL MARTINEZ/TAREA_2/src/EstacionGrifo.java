import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class EstacionGrifo {
    private static final double SALDO_INICIAL_TARJETA = 1250.44;
    private static final double[] PRECIOS_COMBUSTIBLE = {19.40, 16.80, 9.50}; // Premium, Regular, Diesel

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de placa
        System.out.print("Ingrese el número de placa (6 caracteres alfanuméricos): ");
        String placa = scanner.nextLine();
        while (!placa.matches("[a-zA-Z0-9]{6}")) {
            System.out.print("Número de placa inválido. Ingrese 6 caracteres alfanuméricos: ");
            placa = scanner.nextLine();
        }
        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar tipo de combustible
        System.out.println("Seleccione el tipo de combustible: 1. Premium, 2. Regular, 3. Diesel");
        int tipoCombustible = scanner.nextInt();
        double precioUnitario = PRECIOS_COMBUSTIBLE[tipoCombustible - 1];

        // Solicitar monto de carga
        System.out.print("Ingrese el monto a cargar o 300 para tanque lleno: ");
        double montoCarga = scanner.nextDouble();
        if (montoCarga == 300) {
            montoCarga = 300;
        }
        // Calcular cantidad en galones y verificar saldo
        double cantidadGalones = montoCarga / precioUnitario;
        double saldoRestante = SALDO_INICIAL_TARJETA - montoCarga;

        if (montoCarga > 0 && montoCarga <= SALDO_INICIAL_TARJETA) {
            System.out.println("Monto pagado: " + montoCarga + " soles");
            System.out.println("Monto en letras: " + convertirMontoALetras((int) montoCarga));
            System.out.println("Placa: " + placa);
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha y hora de la transacción: " + obtenerFechaHora());
            System.out.println("Precio unitario: " + precioUnitario + " soles/galón");
            System.out.println("Cantidad de galones: " + cantidadGalones);
            System.out.println("Saldo restante en tarjeta: " + saldoRestante);
        } else {
            System.out.println("Saldo insuficiente para la carga solicitada.");
        }
        scanner.close();

    }

    // Método para convertir el monto a letras
    private static String convertirMontoALetras(int monto) {
        switch (monto) {
            case 1000: return "mil soles";
            case 500: return "quinientos soles";
            case 300: return "trescientos soles";
            default: return monto + " soles"; // Simplificación
        }
    }

    // Método para obtener la fecha y hora actual
    private static String obtenerFechaHora() {
        SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatoFechaHora.format(new Date());
    }
}

