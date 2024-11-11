package com.ejercios.metodos2;

import java.util.Scanner;

public class Interfas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Mes : ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el Dia : ");
        int dia = scanner.nextInt();

        Estaciones estaciones = new Estaciones(mes, dia);

        estaciones.operacion();
    }
}
