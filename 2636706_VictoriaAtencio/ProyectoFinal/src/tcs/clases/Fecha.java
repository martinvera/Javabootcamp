package tcs.clases;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public static String fechaHoraActual(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime fecHoraActual = LocalDateTime.now(ZoneId.of("America/Lima"));

        return fecHoraActual.format(formato);
    }
}
