package com.ejercios.metodos2;

public class Estaciones {
    private int mes;
    private int dia;

    public Estaciones(){

    }

    public Estaciones(int mes, int dia) {
        this.mes = mes;
        this.dia = dia;
    }

    public void operacion(){
        String resultado;
        resultado = switch (this.mes) {
            case 1 -> "Verano";
            case 2 -> "verano";
            case 3 -> (this.dia < 20) ? "verano" : "otoño";
            case 4 -> "Otoño";
            case 5 -> "Otoño";
            case 6 -> (this.dia < 20) ? "Otoño" : "invierno";
            case 7 -> "invierno";
            case 8 -> "invierno";
            case 9 -> (this.dia < 22) ? "invierno" : "Primavera";
            case 10 -> "Primavera";
            case 11 -> "Primavera";
            case 12 -> (this.dia < 21) ? "Primavera" : "verano";
            default -> "Dato Erroneo";
        };
        System.out.println("la estación del año es: " + resultado);

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
