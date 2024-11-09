package exercice1;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {
    // Obtener fecha y hora actual
    public static String obtenerFechaHoraActual(String zona) {
        // Formato
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Obtener la zona horaria especificada
        ZoneId zonaHoraria = ZoneId.of(zona);

        // Obtener la fecha y hora actual con la zona
        ZonedDateTime fechaHoraConZona = ZonedDateTime.now(zonaHoraria);
        return fechaHoraConZona.format(formatoFechaHora);
    }
}
