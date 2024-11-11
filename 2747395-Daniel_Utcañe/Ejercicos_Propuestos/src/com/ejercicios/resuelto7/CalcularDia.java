package com.ejercicios.resuelto7;

import java.time.LocalDate;

public class CalcularDia {
    public static void main(String[] args) {
    int anio = 2024;
    int dia = 22;
    int mes = 11;
    int anioDia, mesDia, diaDia;


    LocalDate fecha = LocalDate.of(anio, mes, dia);

    anioDia = fecha.lengthOfYear();
    mesDia = fecha.lengthOfMonth();

        System.out.println("Los dias del año son : " + anioDia);
        System.out.println("Los dias del mes son : " + mesDia);

    }



}
