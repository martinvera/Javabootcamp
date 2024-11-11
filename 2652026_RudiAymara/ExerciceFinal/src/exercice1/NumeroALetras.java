package exercice1;

public class NumeroALetras {

    // Convertir número a palabras
    public static String numeroALetras(double numero) {
        // Arreglos con los nombres de los números en español
        String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve" };
        String[] decenas = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
        String[] centenas = { "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos",
                "setecientos", "ochocientos", "novecientos" };
        String[] miles = { "", "mil", "millón", "mil millones", "billón", "mil billones" };
        // Para los números enteros
        int numeroEntero = (int) numero;

        // Convertir la parte entera
        String letrasEntero = convertirParteEntera(numeroEntero, unidades, decenas, centenas, miles);

        // Si hay decimales, convertirlos también
        int parteDecimal = (int) ((numero - numeroEntero) * 100);
        String letrasDecimal = "";

        if (parteDecimal > 0) {
            letrasDecimal = " con " + convertirParteEntera(parteDecimal, unidades, decenas, centenas, miles) + " centavos";
        }

        return letrasEntero + letrasDecimal;
    }

    // Método para convertir la parte entera
    private static String convertirParteEntera(int numero, String[] unidades, String[] decenas, String[] centenas, String[] miles) {
        if (numero == 100) {
            return "cien"; // Caso especial
        }
        // Convertir en miles y numeros más grandes
        StringBuilder resultado = new StringBuilder();
        int contador = 0; // Para contar las posiciones de miles, millones y otros.

        // Procesar en bloques de 3 dígitos (unidades, miles, millones, etc.)
        while (numero > 0) {
            int parte = numero % 1000; // Tomamos los 3 últimos dígitos
            if (parte > 0) {
                String palabra = convertirParteMenorA1000(parte, unidades, decenas, centenas);
                if (contador > 0) {
                    palabra += " " + miles[contador]; // Añadimos la unidad correspondiente (mil, millón, etc.)
                }
                resultado.insert(0, palabra + " ");
            }
            numero /= 1000; // Reducimos el número dividiéndolo por 1000
            contador++;
        }

        return resultado.toString().trim();
    }

    // Método para convertir números menores a 1000 (unidades, decenas, centenas)
    private static String convertirParteMenorA1000(int numero, String[] unidades, String[] decenas, String[] centenas) {
        if (numero < 20) {
            return unidades[numero]; // Números del 0 al 19
        } else if (numero < 100) {
            return decenas[numero / 10] + (numero % 10 != 0 ? " y " + unidades[numero % 10] : "");
        } else if (numero < 1000) {
            return centenas[numero / 100] + (numero % 100 != 0 ? " " + convertirParteMenorA1000(numero % 100, unidades, decenas, centenas) : "");
        }
        return String.valueOf(numero);
    }
}
