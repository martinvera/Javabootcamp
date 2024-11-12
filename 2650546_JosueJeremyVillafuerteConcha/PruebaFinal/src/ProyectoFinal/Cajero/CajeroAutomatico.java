package ProyectoFinal.Cajero;

import ProyectoFinal.Banco.Constantes;
import ProyectoFinal.Banco.Convertidor;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class CajeroAutomatico {

    Scanner scanner = new Scanner(System.in);
    private String nombres, apellidos, numeroTarjeta;
    private double saldo;

    public CajeroAutomatico(String nombres, String apellidos, String numeroTarjeta, double saldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }

    public CajeroAutomatico() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected String validarTarjeta(){
        int cont = 1;
        while (cont <= Constantes.INTENTOS) {
            System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.nextLine();
            if (getNumeroTarjeta().matches("\\d{16}")) {
                setNumeroTarjeta(numeroTarjeta);
                return numeroTarjeta;
            } else {
                System.out.println(Constantes.MENSAJE_TARJETA);
            }
            cont++;
        }
        System.out.println(Constantes.MENSAJE_FINAL);
        System.exit(1);
        return "";
    }

    protected int monedaRetiro(){
        int cont = 1;
        while (cont <= Constantes.INTENTOS) {
            System.out.print("Opción (1 o 2): ");
            int opcionMoneda = scanner.nextInt();
            if (opcionMoneda == 1 || opcionMoneda == 2) {
                return opcionMoneda;
            } else {
                System.out.println(Constantes.MENSAJE_MONEDA);
            }
            cont++;
        }
        System.out.println(Constantes.MENSAJE_FINAL);
        System.exit(1);
        return 0;
    }

    protected double retirarSaldo(int opcionMoneda){
        int cont = 1;
        double montoConvertido = 0;
        while (cont <= Constantes.INTENTOS) {
            System.out.print("Ingrese el monto a retirar: ");
            double montoSolicitado = scanner.nextInt();
            if (montoSolicitado > 0) {
                if (opcionMoneda == 2) {
                    montoConvertido = montoSolicitado * Constantes.TIPO_CAMBIO;
                    if (montoConvertido <= saldo) {
                        saldo -= montoConvertido;
                        return montoSolicitado;
                    } else {
                        System.out.println(Constantes.MENSAJE_RETIRO_1);
                    }
                } else if (opcionMoneda == 1 && montoSolicitado <= saldo) {
                    saldo -= montoSolicitado;
                    montoConvertido = montoSolicitado;
                    return montoSolicitado;
                } else {
                    System.out.println(Constantes.MENSAJE_RETIRO_1);
                }
            } else {
                System.out.println(Constantes.MENSAJE_RETIRO_2);
            }
            cont++;
        }
        System.out.println(Constantes.MENSAJE_FINAL);
        System.exit(1);
        return 0;
    }

    protected void imprimirBoucher(int opcionMoneda, double montoSolicitado){
        String moneda = (opcionMoneda == 1) ? "soles" : "dólares";
        System.out.println("\n--- Detalles de la Transacción ---");
        System.out.println("Tarjeta: **** **** **** " + getNumeroTarjeta().substring(12));
        System.out.println("Nombre Completos: " + getNombres() + " " + getApellidos());
        System.out.println("Monto retirado: " + montoSolicitado + " " + moneda + " (" + Convertidor.numeroALetras((int) montoSolicitado) + " con ceros " + moneda + ")");
        System.out.println("Saldo restante: " + NumberFormat.getCurrencyInstance(new Locale("es", "PE")).format(getSaldo()));
        // Fecha y hora de la transacción - Zona
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone(Constantes.ZONA_HORARIA));
        System.out.println("Fecha y hora de la transacción: " + sdf.format(new Date()));
    }

    protected void mensajeInicial(){
        System.out.println("--- Bienvenido al Cajero Automatico --- \nPor favor ingresar los datos solicitados. Por su seguridad, solamente tienes " + Constantes.INTENTOS + " intentos disponibles");
    }
}
