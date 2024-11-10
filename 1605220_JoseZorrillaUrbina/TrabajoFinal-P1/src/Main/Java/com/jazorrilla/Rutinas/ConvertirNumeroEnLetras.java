package com.jazorrilla.Rutinas;

public class ConvertirNumeroEnLetras {
    private static final String[] UNIDADES = {
            "", "UN", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE"
    };

    private static final String[] DECENAS = {
            "", "DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA",
            "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"
    };

    private static final String[] ESPECIALES = {
            "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS",
            "DIECISIETE", "DIECIOCHO", "DIECINUEVE"
    };

    private static final String[] CENTENAS = {
            "", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS",
            "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"
    };

    public static String convertidorNumeroALetras(double numero) {
        String numeroStr = String.format("%.2f", numero); // Formatea a 2 decimales
        String[] partes = numeroStr.split("\\.");
        long parteEntera = Long.parseLong(partes[0]);
        int decimales = Integer.parseInt(partes[1]);

        if (parteEntera == 0) {
            return "CERO" + (decimales > 0 ? " CON " + convertirDecimales(decimales) : "");
        }

        StringBuilder resultado = new StringBuilder();

        if (parteEntera < 0) {
            resultado.append("MENOS ");
            parteEntera = Math.abs(parteEntera);
        }

        // Procesar miles de millones
        if (parteEntera >= 1000000000) {
            long milMillones = parteEntera / 1000000000;
            resultado.append(convertirGrupo((int) milMillones))
                    .append(milMillones == 1 ? " MILLARDO " : " MILLARDOS ");
            parteEntera %= 1000000000;
        }

        // Procesar millones
        if (parteEntera >= 1000000) {
            long millones = parteEntera / 1000000;
            resultado.append(convertirGrupo((int) millones))
                    .append(millones == 1 ? " MILLÓN " : " MILLONES ");
            parteEntera %= 1000000;
        }

        // Procesar miles
        if (parteEntera >= 1000) {
            long miles = parteEntera / 1000;
            resultado.append(convertirGrupo((int) miles)).append(" MIL ");
            parteEntera %= 1000;
        }

        // Procesar centenas
        if (parteEntera > 0) {
            resultado.append(convertirGrupo((int) parteEntera));
        }

        // Agregar decimales si existen
        if (decimales > 0) {
            resultado.append(" CON ").append(convertirDecimales(decimales));
        }

        return resultado.toString().trim();
    }

    private static String convertirGrupo(int numero) {
        StringBuilder resultado = new StringBuilder();

        // Caso especial para el 100
        if (numero == 100) {
            return "CIEN";
        }

        // Procesar centenas
        int centena = numero / 100;
        if (centena > 0) {
            resultado.append(CENTENAS[centena]).append(" ");
        }

        // Procesar decenas y unidades
        int decena = (numero % 100) / 10;
        int unidad = numero % 10;

        if (decena == 1 && unidad > 0) {
            // Casos especiales (11-19)
            resultado.append(ESPECIALES[unidad - 1]);
        } else {
            if (decena > 0) {
                resultado.append(DECENAS[decena]);
                if (unidad > 0) {
                    resultado.append(decena == 2 ? "I" : " Y ");
                }
            }
            if (unidad > 0) {
                resultado.append(UNIDADES[unidad]);
            }
        }

        return resultado.toString().trim();
    }

    private static String convertirDecimales(int decimales) {
        return String.format("%02d/100", decimales);
    }
}