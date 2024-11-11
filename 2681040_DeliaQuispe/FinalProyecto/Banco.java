package FinalProyecto;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Banco {
    //Vamos declarar los variables
    private static  double saldo_inicial= 5500.88;
    private static  double tipoDeCambio = 4.0;
    private static  double saldo = saldo_inicial;
    int moneda;
    double montoRetiro;
    Scanner scanner= new Scanner(System.in);

    public void selecionarTipoDeMoneda(){

        //int moneda;
        while (true) {
            System.out.print("Seleccione la moneda de retiro: 1 para Soles, 2 para Dólares: ");
            moneda = scanner.nextInt();
            if (moneda == 1 || moneda == 2) {
                break;
            } else {
                System.out.println("Opción inválida. Ingrese 1 para Soles o 2 para Dólares.");
            }
        }
    }

    public void SolicitarMontoRetiroValidar(){
        //double montoRetiro;
        while (true) {
            System.out.print("Ingrese el monto a retirar: ");
            montoRetiro = scanner.nextDouble();
            if (montoRetiro <= 0) {
                System.out.println("El monto a retirar debe ser mayor a cero.");
                continue;
            }

            // Convertir a soles si el retiro es en dólares
            if (moneda == 2) {
                montoRetiro *= tipoDeCambio;
            }

            if (montoRetiro > saldo) {
                System.out.println("El monto a retirar no puede exceder el saldo disponible de " + saldo + " soles.");
            } else {
                saldo -= montoRetiro;
                break;
            }
        }
    }

    public void MostrarMontoRetiradoSaldoRestante(){
        String montoLetras = convertirNumeroALetras((int) montoRetiro);
        System.out.println("Monto retirado: " + formatMoneda(montoRetiro) + " soles (" + montoLetras + " con céntimos)");
        System.out.println("Saldo restante: " + formatMoneda(saldo) + " soles");
        System.out.println("Fecha y hora de transacción: " + obtenerFechaHora());
    }

    private static String convertirNumeroALetras(int numero) {
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        String[] miles = {"", "mil"};

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int mil = (numero / 1000);

        StringBuilder letras = new StringBuilder();
        if (mil > 0) letras.append(miles[mil]).append(" ");
        if (centena > 0) letras.append(centenas[centena]).append(" ");
        if (decena > 0) letras.append(decenas[decena]).append(" ");
        if (unidad > 0) letras.append(unidades[unidad]);

        return letras.toString().trim();
    }

    // Método para formatear el monto en soles
    private static String formatMoneda(double monto) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "PE"));
        return nf.format(monto);
    }

    // Método para obtener la fecha y hora actual
    private static String obtenerFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }
}

