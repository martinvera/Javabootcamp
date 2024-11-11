package com.ejemplo.herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Harry", 25, 7000, 200);
        Empleado empleadoTiempoParcial = new EmpleadoTiempoParcial("Carlos", 35, 5000, 8, 2);

        System.out.println("Empleado tiempo completo :: " + empleadoTiempoCompleto);
        System.out.println("Empleado tiempo parcial :: " + empleadoTiempoParcial);
    }
}
