import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CajeroAutomatico {

    private double montoCajero;
    private double tipoDeCambio;

    private String numeroTarjeta;
    private String nombreRetira;
    private String apellidoRetira;
    private double montoRetiro;
    private double montoRetiroConvertido;
    private int monedaRetiro;

    public CajeroAutomatico() {
        this.montoCajero = Constantes.MONTO_INICIAL;
        this.tipoDeCambio = Constantes.TIPO_CAMBIO_INICIAL;
    }

    public void solicitarDatosRetiro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero de tarjeta (16 digitos): ");
        numeroTarjeta = scanner.useLocale(Locale.US).next();

        validarNumeroDeTarjeta();

        System.out.print("Ingrese nombre: ");
        nombreRetira = scanner.next();

        System.out.print("Ingrese apellido: ");
        apellidoRetira = scanner.next();

        System.out.print("Ingrese monto (#.##): ");
        montoRetiro = scanner.nextDouble();

        System.out.print("Ingrese tipo moneda (1=Soles, 2=Dolares): ");
        monedaRetiro = scanner.nextInt();

        convertirMontoRetiro();

        validarDatosRetiro();

        scanner.close();
    }

    private void validarNumeroDeTarjeta() {
        if(!numeroTarjeta.matches("(\\d)*")) {
            System.err.println("El numero de tarjeta es invalido");
            System.exit(0);
        } else if(numeroTarjeta.length() != 16) {
            System.err.println("El numero de tarjeta debe tener 16 digitos");
            System.exit(0);
        }
    }

    private void validarDatosRetiro() {
        //validar monto a retirar
        if(montoRetiro < 0) {
            System.err.println("El monto a retirar no puede ser negativo.");
            System.exit(0);
        }

        //validar saldo cajero
        if(montoRetiroConvertido > montoCajero) {
            System.err.printf("El monto a retirar no puede ser mayor a su saldo (%.2f).", montoCajero);
            System.exit(0);
        }
    }

    private void convertirMontoRetiro() {
        //convertir monto a retirar
        if(monedaRetiro == 1) {
            montoRetiroConvertido = montoRetiro;
        } else if(monedaRetiro == 2) {
            montoRetiroConvertido = montoRetiro * tipoDeCambio;
            System.out.printf("Convirtiendo monto a soles -> %.2f soles%n", montoRetiroConvertido);
        } else {
            System.err.println("El tipo de moneda es invalido.");
            System.exit(0);
        }
    }

    public void retirarDinero() {
        montoCajero = montoCajero - montoRetiroConvertido;
        System.out.println();
        System.out.println("✓✓✓ RETIRO REALIZADO CON EXITO ✓✓✓");
        System.out.println("**********************************");
        System.out.println("NUMERO DE TARJETA: " + numeroTarjeta);
        System.out.println("CLIENTE: " + nombreRetira + " " + apellidoRetira);
        System.out.printf("MONTO RETIRO: %.2f", montoRetiroConvertido);
        System.out.println("MONTO RETIRO EN LETRAS: " + convertirMontoATexto(montoRetiroConvertido));
        System.out.printf("SALDO CAJERO: %.2f", montoCajero);
        System.out.println();

    }

    public String convertirMontoATexto(double monto) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        DecimalFormat df = new DecimalFormat("0.00", symbols);
        String montoDosDecimales = df.format(monto);
        String montoParteDecimal = montoDosDecimales.split(",")[1];
        return NumeroATexto.numeroATexto((int) monto) + " con " + montoParteDecimal + "/100 soles.";
    }

}
