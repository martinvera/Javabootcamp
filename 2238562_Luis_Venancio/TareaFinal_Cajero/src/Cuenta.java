import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta {
    //Atributos de clase
    private String titular;
    private String PIN;
    private double saldo;

    //Constructor
    public Cuenta(String titular, String PIN, double saldo) {
        this.titular = titular;
        this.PIN = PIN;
        if (saldo < 0) //Nos aseguramos que no se inicie con saldo negativo
            this.saldo = 0;
        else
            this.saldo = saldo;
    }

    //Métodos getter's y setter's
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getPIN() {
        return PIN;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    //Métodos para operar con la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("\nOperacion completada.");
        }
        else
            System.out.println("\nCantidad a ingresar ha de ser un monto positivo");
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > saldo)
            System.out.println("\nEl valor ingresado es negativo o mayor al saldo disponible");
        else {

            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println("El monto total era: " + saldo);
            System.out.println("El monto retirado es: " + cantidad);
            System.out.println("El monto restante es : " + (saldo-cantidad));
            System.out.println("Hora actual: " + dateFormat.format(date));
            System.out.println("\nOperacion completada.");
        }
    }

}
