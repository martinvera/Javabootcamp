package tcs.clases;

public class Utiles {



    // Arrays de unidades, decenas, centenas y potencias de mil
    private static final String[] UNIDADES = {
            "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
            "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete",
            "dieciocho", "diecinueve"
    };

    private static final String[] DECENAS = {
            "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta",
            "ochenta", "noventa"
    };

    private static final String[] CENTENAS = {
            "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos",
            "seiscientos", "setecientos", "ochocientos", "novecientos"
    };

    private static final String[] MIL = {"", "mil", "millón", "mil millones"};

    // Método para convertir un número menor a 1000
    private static String convertirCentenas(int numero) {
        if (numero == 0) return "";
        String letras = "";

        if (numero >= 100) {
            letras += CENTENAS[numero / 100] + " ";
            numero %= 100;
        }

        if (numero >= 20) {
            letras += DECENAS[numero / 10] + " ";
            numero %= 10;
        }

        if (numero > 0) {
            letras += UNIDADES[numero] + " ";
        }

        return letras.trim();
    }

    // Método que convierte un número grande (miles, millones) en texto
    public static String convertirMontoEnLetras(double monto) {
        if (monto == 0) {
            return "cero soles";
        }

        // Separar la parte entera y la parte decimal
        int parteEntera = (int) monto;
        int parteDecimal = (int) Math.round((monto - parteEntera) * 100);

        String resultado = convertirMiles(parteEntera);

        // Si la parte decimal es mayor que 0, agregar la parte de los centavos
        if (parteDecimal > 0) {
            resultado += " con " + parteDecimal + "/100";
        }

        return resultado.trim();
    }

    // Método para convertir grandes números (miles, millones, etc.)
    public static String convertirMiles(int numero) {
        String letras = "";

        if (numero >= 1000000) {
            letras += convertirCentenas(numero / 1000000) + " millón ";
            numero %= 1000000;
        }

        if (numero >= 1000) {
            letras += convertirCentenas(numero / 1000) + "mil ";
            numero %= 1000;
        }

        if (numero > 0) {
            letras += convertirCentenas(numero);
        }

        return letras.trim();
    }

}
