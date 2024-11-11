package CajeroAutomatico_v2;
import java.time.LocalDateTime;

public abstract class Transaccion {
    protected Usuario usuario;
    protected LocalDateTime fechaHora;

    public Transaccion(Usuario usuario) {
        this.usuario = usuario;
        this.fechaHora = LocalDateTime.now();
    }

    // Método abstracto para realizar la transacción
    public abstract void realizarTransaccion(double monto, String moneda);

    // Método para obtener la fecha y hora
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
