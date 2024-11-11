package com.tarea;

import java.time.LocalDate;

import java.util.Scanner;

public class tarea7 {

    /*7. Imprimir el día de una fecha cualquiera.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la fecha con el siguiente formato YYYY-MM-DD");

        String dia = scan.nextLine();
        if (dia.contains("-" && dia.length() == 10)) {
            LocalDate fecha = LocalDate.parse(dia);
            System.out.println("El día para esta fecha es " + fecha.getDayOfWeek());
        }else {
            System.out.println("Ingrese la fecha em el formato indicado");
        }
    }
}
