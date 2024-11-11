package com.lafajardo.util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

// Clase para validación y conversión
public class Validacion {

    // Valida número de tarjeta
    public static boolean esNumeroDeTarjetaValido(String numeroTarjeta) {
        if (numeroTarjeta.length() != 16) {
            return false;
        }
        for (int i = 0; i < 16; i++) {
            if (!Character.isDigit(numeroTarjeta.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Convierte monto retirado a letras
    public static String montoEnLetras(BigDecimal monto) {
        int parteEntera = monto.intValue();
        int parteDecimal = monto.remainder(BigDecimal.ONE).movePointRight(2).intValue();

        String parteEnteraEnLetras;
        switch (parteEntera) {
            case 1000:
                parteEnteraEnLetras = "mil";
                break;
            case 2000:
                parteEnteraEnLetras = "dos mil";
                break;
            case 3000:
                parteEnteraEnLetras = "tres mil";
                break;
            default:
                parteEnteraEnLetras = convertirNumeroATexto(parteEntera);
                break;
        }

        String parteDecimalEnLetras = (parteDecimal == 0) ? "cero" : convertirNumeroATexto(parteDecimal);

        return String.format("%s con %s céntimos", parteEnteraEnLetras, parteDecimalEnLetras);
    }

    // No contempla todos los casos pero si muchos de ellos para este ejercicio
    // tambien podria emplear Map<Integer, String> pero prefiero no hacerlo
    private static String convertirNumeroATexto(int numero) {
        switch (numero) {
            case 1: return "uno";
            case 2: return "dos";
            case 3: return "tres";
            case 4: return "cuatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "siete";
            case 8: return "ocho";
            case 9: return "nueve";
            case 10: return "diez";
            case 20: return "veinte";
            case 30: return "treinta";
            case 100: return "cien";
            case 1000: return "mil";

            default: return String.valueOf(numero);
        }
    }

    // Obtiene fecha y hora actual
    public static String obtenerFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }

    public static boolean validarNombreOApellido(String texto, String tipo, int maxPalabras) {
        // Valida longitud mínima y caracteres permitidos
        if (texto.length() < 2) {
            System.out.println("El " + tipo + " debe tener al menos 2 letras. Por favor, inténtelo de nuevo.");
            return false;
        } else if (!texto.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            System.out.println("El " + tipo + " solo debe contener letras y espacios. Por favor, inténtelo de nuevo.");
            return false;
        }

        // Divide el texto en palabras y validar el número de palabras
        String[] palabras = texto.split(" ");
        if (palabras.length > maxPalabras) {
            System.out.println("El " + tipo + " no debe tener más de " + maxPalabras + " palabras. Por favor, inténtelo de nuevo.");
            return false;
        }

        // Valida que cada palabra no supere los 40 caracteres
        for (String palabra : palabras) {
            if (palabra.length() > 40) {
                System.out.println("Cada palabra del " + tipo + " debe tener un máximo de 40 caracteres. Por favor, inténtelo de nuevo.");
                return false;
            }
        }
        return true;
    }
}