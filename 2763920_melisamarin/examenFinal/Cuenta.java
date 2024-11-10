package com.examenFinal;

public class Cuenta {
    private String numeroTarjeta;
    private String nombre;
    private String apellido;
    private double saldo;

    public Cuenta(String numeroTarjeta, String nombre, String apellido, double saldoInicial) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
}
