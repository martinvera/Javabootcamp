// NumeroALetras.java
package exercice1;

public class NumeroALetras {
    // Convertir número a palabras
    public static String numeroALetras(int numero) {
        // Arreglos con los nombres de los números en español
        String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve" };
        String[] decenas = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
        String[] centenas = { "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos",
                "setecientos", "ochocientos", "novecientos" };

        if (numero == 100) {
            return "cien"; // Caso especial para el número 100
        } else if (numero < 20) {
            return unidades[numero]; // Números del 0 al 19
        } else if (numero < 100) {
            // Decenas de 20 a 99
            return decenas[numero / 10] + (numero % 10 != 0 ? " y " + unidades[numero % 10] : "");
        } else if (numero < 1000) {
            // Centenas de 100 a 999
            return centenas[numero / 100] + (numero % 100 != 0 ? " " + numeroALetras(numero % 100) : "");
        }
        return String.valueOf(numero);
    }
}
