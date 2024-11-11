package com.tarea.tarea7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ImprimirFecha {
    public static void main(String[] args) {
        //Imprimir el día de una fecha cualquiera.

        LocalDate fecha = LocalDate.of(2024, 10, 27);

        // Obtener el día de la semana
        DayOfWeek diaSemana = fecha.getDayOfWeek();

        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("El dia de la fecha ingresada es: " + diaSemana);
    }

}
