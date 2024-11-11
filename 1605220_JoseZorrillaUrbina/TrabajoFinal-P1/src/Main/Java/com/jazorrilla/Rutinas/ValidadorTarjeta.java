package com.jazorrilla.Rutinas;

public class ValidadorTarjeta {
    public static boolean validarTarjeta(String numeroTarjeta) {
        // Eliminar espacios en blanco y guiones si existen
        numeroTarjeta = numeroTarjeta.replaceAll("\\s|-", "");

        // Verificar que solo contenga dígitos y longitud válida (13-19 dígitos)
        if (!numeroTarjeta.matches("\\d{13,19}")) {
            return false;
        }

        // Implementación del algoritmo de Luhn
        int suma = 0;
        boolean alternar = false;

        // Recorrer los dígitos de derecha a izquierda
        for (int i = numeroTarjeta.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroTarjeta.charAt(i));

            if (alternar) {
                digito *= 2;
                if (digito > 9) {
                    digito = digito - 9;
                }
            }

            suma += digito;
            alternar = !alternar;
        }

        // El número es válido si la suma es divisible por 10
        return suma % 10 == 0;
    }
}