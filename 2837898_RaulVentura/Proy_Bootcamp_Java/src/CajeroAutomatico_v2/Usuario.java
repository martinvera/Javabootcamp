package CajeroAutomatico_v2;

public class Usuario {
    private String numeroTarjeta;
    private String nombreCompleto;
    private double saldo;

    public Usuario(String numeroTarjeta, String nombreCompleto, double saldoInicial) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.saldo = saldoInicial;
    }

    // Métodos getter y setter para encapsulación
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void actualizarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
}
