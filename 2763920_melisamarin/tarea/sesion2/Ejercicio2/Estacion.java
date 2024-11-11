package com.tarea.sesion2.Ejercicio2;

public class Estacion {
    private String nombre;
    private int mesActual;

    public Estacion () {

    }

    public Estacion (int mesActual) {
        this.mesActual = mesActual;
    }

    public String obtenerEstacionPorMes (int monthNumber) {
        monthNumber = this.mesActual;
        String resultado;
        if (monthNumber > 12) {
            resultado = "Fuera de rango";
        } else if (monthNumber > 9) {
            resultado = "Primavera";
        } else if (monthNumber > 6) {
            resultado = "Invierno";
        } else if (monthNumber > 3) {
            resultado = "Otoño";
        } else if (monthNumber > 0) {
            resultado = "Verano";
        } else {
            resultado = "Fuera de rango";
        }
        return  resultado;
    }

    public int getMesActual() {
        return mesActual;
    }

    public void setMesActual(int mesActual) {
        this.mesActual = mesActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
