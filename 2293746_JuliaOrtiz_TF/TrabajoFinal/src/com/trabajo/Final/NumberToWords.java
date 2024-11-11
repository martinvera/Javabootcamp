package com.trabajo.Final;

public class NumberToWords {
    // Arrays de palabras para las unidades, decenas y cientos
    private static final String[] UNITS = {
            "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
    };

    private static final String[] TEENS = {
            "diez", "once", "doce", "trece", "catorce", "quince",
            "dieciséis", "diecisiete", "dieciocho", "diecinueve"
    };

    private static final String[] TENS = {
            "", "", "veinte", "treinta", "cuarenta", "cincuenta",
            "sesenta", "setenta", "ochenta", "noventa"
    };

    private static final String[] HUNDREDS = {
            "", "ciento", "doscientos", "trescientos", "cuatrocientos",
            "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
    };

//    public static void main(String[] args) {
//        NumberToWords converter = new NumberToWords();
//        int number = 920;
//        String words = converter.convert(number);
//        System.out.println("El número " + number + " en palabras es: " + words);
//    }

    // Método para convertir número a palabras
    public String convert(int number) {
        if (number == 0) {
            return "cero";
        }

        String words = "";

        if (number / 100 > 0) {
            words += HUNDREDS[number / 100] + " ";
            number %= 100;
        }

        if (number >= 10 && number <= 19) {
            words += TEENS[number - 10] + " ";
        } else {
            if (number / 10 > 0) {
                words += TENS[number / 10] + " ";
                number %= 10;
            }
            if (number > 0) {
                words += UNITS[number] + " ";
            }
        }

        return words.trim();
    }
}


