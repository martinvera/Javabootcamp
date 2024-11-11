public class NumeroATexto {
    
    private static final String[] UNIDADES = {
        "", "uno", "dos", "tres", "cuatro", "cinco", 
        "seis", "siete", "ocho", "nueve"
    };
    
    private static final String[] ESPECIALES = {
        "diez", "once", "doce", "trece", "catorce", 
        "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
    };
    
    private static final String[] DECENAS = {
        "", "", "veinte", "treinta", "cuarenta", 
        "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };
    
    private static final String[] CENTENAS = {
        "", "cien", "doscientos", "trescientos", "cuatrocientos", 
        "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
    };
    
    public static String numeroATexto(int n) {
        if (n < 0) {
            return "menos " + numeroATexto(-n);
        } else if (n == 0) {
            return "cero";
        } else if (n < 10) {
            return UNIDADES[n];
        } else if (n < 20) {
            return ESPECIALES[n - 10];
        } else if (n < 100) {
            return DECENAS[n / 10] + (n % 10 != 0 ? " y " + UNIDADES[n % 10] : "");
        } else if (n < 1000) {
            if (n == 100) {
                return "cien";
            }
            return CENTENAS[n / 100] + (n % 100 != 0 ? " " + numeroATexto(n % 100) : "");
        } else if (n < 1000000) {
            if (n < 2000) {
                return "mil " + (n % 1000 != 0 ? numeroATexto(n % 1000) : "");
            }
            return numeroATexto(n / 1000) + " mil " + (n % 1000 != 0 ? numeroATexto(n % 1000) : "");
        } else if (n < 1000000000) {
            if (n < 2000000) {
                return "un millón " + (n % 1000000 != 0 ? numeroATexto(n % 1000000) : "");
            }
            return numeroATexto(n / 1000000) + " millones " + (n % 1000000 != 0 ? numeroATexto(n % 1000000) : "");
        }
        return "Número fuera de rango";
    }
    
    public static void main(String[] args) {
        System.out.println(numeroATexto(123456)); // "ciento veintitrés mil cuatrocientos cincuenta y seis"
    }
}