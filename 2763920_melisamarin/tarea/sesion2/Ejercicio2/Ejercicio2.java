package com.tarea.sesion2.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Estacion eEstacion = new Estacion();
        eEstacion.setMesActual(13);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
        eEstacion.setMesActual(2);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
        eEstacion.setMesActual(7);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
        eEstacion.setMesActual(4);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
        eEstacion.setMesActual(11);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
        eEstacion.setMesActual(0);
        System.out.println(eEstacion.obtenerEstacionPorMes(eEstacion.getMesActual()));
    }
}
