package clases;

import java.time.LocalDate;

public class diaFecha {
    /*7. Imprimir el día de una fecha cualquiera.*/

    void obtenerDia (String fecha){
        if (fecha.contains("-") && fecha.length() == 10){
            LocalDate dia = LocalDate.parse(fecha);
            System.out.println("El día para esta fecha es " + dia.getDayOfWeek());
        }else {
            System.out.println("La fecha ingresada no contiene el formato solicitado o es incorrecta");
        }
    }
}
