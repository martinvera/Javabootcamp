package ProyectoFinal.Banco;

public class Convertidor {
    private static final String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private static final String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static final String[] centenas = {"", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
    private static String resultado = "";

    public static String numeroALetras(int numero) {
        if (numero >= 1000) {
            resultado = "mil ";
            numero %= 1000;
        }
        if (numero >= 100) {
            resultado += centenas[numero / 100] + " ";
            numero %= 100;
        }
        if (numero >= 10) {
            resultado += decenas[numero / 10] + " ";
            numero %= 10;
        }
        if (numero > 0) {
            resultado += unidades[numero];
        }
        return resultado.trim();
    }
}
