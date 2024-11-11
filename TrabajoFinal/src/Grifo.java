import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Grifo {

    //Constantes
    private static final double SALDO_INICIAL = 1250.44;
    private static final double[] PRECIO_COMBUSTIBLE = {19.40, 16.80, 9.50};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nombre y Apellido
        String placa = pedirPlaca(scanner);
        System.out.print("Ingrese su nombre y apellido: ");
        String nombres = scanner.nextLine();

        //Mostrar saldo en tarjeta
        double saldoDisponible = SALDO_INICIAL;
        System.out.println("Saldo disponible en su tarjeta: " + saldoDisponible + " soles");

        //Solicitar tipo de combustible
        int tipoCombustible = pedirTipoCombustible(scanner);

        //Solicitar tipo de carga
        double montoCarga = pedirMontoCarga(scanner, saldoDisponible);

        //Solicitar tipo de pago
        String tipoPago = pedirTipoPago(scanner);

        //Realizar la compra
        double precioUnitario = PRECIO_COMBUSTIBLE[tipoCombustible];
        double cantidadGalones = 0;
        double montoFinal = 0;

        //Si la carga es menor a 300 soles
        if (montoCarga < 300) {
            cantidadGalones = montoCarga / precioUnitario;
            montoFinal = montoCarga;
        } else {
            // Si la carga es igual a 300 soles
            montoFinal = 300;
            cantidadGalones = 300 / precioUnitario;
        }

        //Verificar saldo y actualizar si el tipo de pago es tarjeta
        if (tipoPago.equals("tarjeta")) {
            if (montoFinal <= saldoDisponible) {
                saldoDisponible -= montoFinal;
            } else {
                System.out.println("Error: No tiene suficiente saldo en la tarjeta.");
                return;
            }
        }

        //Confirmar compra e imprimir detalles
        System.out.println("---Compra confirmada---");
        System.out.println("Monto pagado: " + montoFinal + " soles");
        System.out.println("Placa: " + placa);
        System.out.println("Nombre y Apellido: " + nombres);

        //Fecha y hora de la transaccion
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaTransaccion = new Date();
        System.out.println("Fecha y hora de la transaccion: " + fecha.format(fechaTransaccion));

        //Detalle de la compra
        System.out.println("Precio unitario: " + precioUnitario + " soles por galon");
        System.out.println("Cantidad en galones: " + cantidadGalones);
        System.out.println("Monto final a pagar: " + montoFinal + " soles");

        //Si el pago fue con tarjeta, mostrar el saldo restante
        if (tipoPago.equals("tarjeta")) {
            System.out.println("Saldo restante en tarjeta: " + saldoDisponible + " soles");
        }
    }

    //Pedir y validar la placa (6 dígitos alfanumerico)
    private static String pedirPlaca(Scanner scanner) {
        String placa;
        while (true) {
            System.out.print("Ingrese su numero de placa (6 caracteres alfanumerico): ");
            placa = scanner.nextLine();
            if (placa.matches("[A-Za-z0-9]{6}")) {
                break;
            } else {
                System.out.println("Error: La placa debe ser alfanumerico y tener 6 caracteres.");
            }
        }
        return placa;
    }

    //Pedir el tipo de combustible
    private static int pedirTipoCombustible(Scanner scanner) {
        int tipoCombustible;
        while (true) {
            System.out.print("Seleccione el tipo de combustible (1 para Premium, 2 para Regular, 3 para Diesel): ");
            tipoCombustible = scanner.nextInt();
            if (tipoCombustible >= 1 && tipoCombustible <= 3) {
                tipoCombustible--;
                break;
            } else {
                System.out.println("Error: Opcion invalida. Ingrese 1, 2 o 3.");
            }
        }
        return tipoCombustible;
    }

    //Pedir el monto de carga
    private static double pedirMontoCarga(Scanner scanner, double saldoDisponible) {
        double montoCarga;
        while (true) {
            System.out.print("Ingrese el monto a cargar (menos de 300 soles para carga parcial o 300 para tanque lleno): ");
            montoCarga = scanner.nextDouble();
            if (montoCarga > 0 && montoCarga <= saldoDisponible) {
                break;
            } else {
                System.out.println("Error: El monto debe ser mayor a 0 y no puede exceder el saldo disponible.");
            }
        }
        return montoCarga;
    }

    //Pedir el tipo de pago
    private static String pedirTipoPago(Scanner scanner) {
        String tipoPago;
        while (true) {
            System.out.print("Seleccione el tipo de pago (efectivo o tarjeta): ");
            tipoPago = scanner.next();
            if (tipoPago.equalsIgnoreCase("efectivo") || tipoPago.equalsIgnoreCase("tarjeta")) {
                break;
            } else {
                System.out.println("Error: Opcion invalida. Ingrese 'efectivo' o 'tarjeta'.");
            }
        }
        return tipoPago;
    }
}
