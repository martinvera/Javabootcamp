package com.ejemplo.metodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

// Clase
public class Persona {

    // Variables de instancia
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    // Metodo para calcular la edad
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now(ZoneId.of("America/Lima"))).getYears();
    }

    // Metodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [ nombre: " + nombre + ", apellido: " + apellido + ", edad: " + calcularEdad() + " ]";
    }
}
