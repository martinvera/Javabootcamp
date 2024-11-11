package CajeroAutomatico_v1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilidades {
    public static String obtenerFechaYHora() {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return fechaHora.format(formato);
    }
}
