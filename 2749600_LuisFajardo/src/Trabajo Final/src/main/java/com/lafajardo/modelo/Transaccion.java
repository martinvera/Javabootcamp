package com.lafajardo.modelo;

import com.lafajardo.util.Validacion;
import java.math.BigDecimal;

// Clase para imprimir recibo. Uso de herencia
public class Transaccion {

    protected void imprimirRecibo(String nombre, String numeroTarjeta, BigDecimal montoRetirado, Cuenta cuenta) {
        System.out.println("\n--- Recibo de la Transacción ---");
        System.out.println("Titular: " + nombre);
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        System.out.println("Monto retirado: S/ " + montoRetirado + " (" + Validacion.montoEnLetras(montoRetirado) + ")");
        System.out.println("Saldo actual: S/ " + cuenta.getSaldo() + " (" + Validacion.montoEnLetras(cuenta.getSaldo()) + ")");
        System.out.println("Fecha y hora de transacción: " + Validacion.obtenerFechaHora());
    }
}