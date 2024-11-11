package CajeroAutomatico_v1;

public class Validaciones {
    public static boolean validarNumeroTarjeta(String numeroTarjeta) {
        return numeroTarjeta.matches("\\d{16}");
    }
}
