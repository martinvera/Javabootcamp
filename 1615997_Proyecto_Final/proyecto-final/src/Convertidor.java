public class Convertidor {

    private final String[] units = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private final String[] teens = {"diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};
    private final String[] tens = {"", "", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Cesenta", "Setenta", "Ochenta", "Noventa"};
    private final String[] hundreds = {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public String convertToWords(double number) {
        int integerPart = (int) number; // Parte entera
        int decimalPart = (int) Math.round((number - integerPart) * 100); // Parte decimal redondeada a 2 decimales

        String integerPartInWords = convertIntegerToWords(integerPart);
        String decimalPartInWords = convertIntegerToWords(decimalPart);

        return integerPartInWords + " soles con " + decimalPartInWords + " centimos"; // Formato "xx con yy/100"
    }

    private String convertIntegerToWords(int number) {
        if (number == 0) return "cero";
        if (number < 10) return units[number];
        if (number < 20) return teens[number - 10];
        if (number < 100) return tens[number / 10] + (number % 10 != 0 ? " y " + units[number % 10] : "");
        if (number < 1000)
            return hundreds[number / 100] + (number % 100 != 0 ? " " + convertIntegerToWords(number % 100) : "");
        // Extender para miles o millones según se requiera
        return "";
    }
}

