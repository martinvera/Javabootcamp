package com.segunda.tarea.ejercicio1;

public class DiaImparCalendario {
    //2018580 Cinthia Rojas
    public static void main(String[] args) {
        Mes mes = new Mes(30); // Crear un objeto Mes con 30 días
        mes.mostrarDiasImpares(); // Llamar al método para mostrar los días impares
    }
}
class Mes {
    private int dias;
    // Constructor
    public Mes(int dias) {
        this.dias = dias;
    }
    // Método para mostrar los días impares
    public void mostrarDiasImpares() {
        System.out.println("Días impares del mes:");
        for (int dia = 1; dia <= dias; dia++) {
            if (esImpar(dia)) {
                System.out.println("Día: " + dia);
            }
        }
    }
    // Método para verificar si un día es impar
    private boolean esImpar(int dia) {
        return dia % 2 !=0;
    }
}
