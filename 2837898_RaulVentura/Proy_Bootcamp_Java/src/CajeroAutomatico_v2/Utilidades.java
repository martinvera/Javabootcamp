package CajeroAutomatico_v2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilidades {
    public static String formatoFecha(LocalDateTime fechaHora) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return fechaHora.format(formato);
    }
}
