package CajeroAutomatico_v2;

public class Retiro extends Transaccion{
    private static final double TIPO_DE_CAMBIO = 4.0;

    public Retiro(Usuario usuario) {
        super(usuario);
    }

    @Override
    public void realizarTransaccion(double monto, String moneda) {
        double montoConvertido = moneda.equalsIgnoreCase("dolares") ? monto * TIPO_DE_CAMBIO : monto;
        if (montoConvertido <= usuario.getSaldo()) {
            usuario.actualizarSaldo(usuario.getSaldo() - montoConvertido);
            mostrarResultado(montoConvertido, moneda);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    private void mostrarResultado(double monto, String moneda) {
        System.out.println("Monto retirado: " + monto + " " + moneda);
        System.out.println("Monto en letras: " + ConversorMonto.convertirNumeroALetras(monto) + " " + moneda);
        System.out.println("Saldo actual: " + usuario.getSaldo());
        System.out.println("Fecha y hora de la transacción: " + Utilidades.formatoFecha(fechaHora));
    }
}
