package com.tarea.sesion2.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Mes eMes = new Mes();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number > ");
        eMes.setNumeroRepresentacion(scanner.nextInt());

        eMes.setRegion("America/Lima");
        eMes.setNombre();

        eMes.setTotalDias();
        eMes.getTotalDias();

        eMes.mostrarDiasCalendario();
        eMes.mostrarDiasImpares();
    }
}
