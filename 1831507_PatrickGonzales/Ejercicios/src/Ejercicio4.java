import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra u oracion: ");
        String texto = scanner.nextLine();

        //Convertiendo texto u oracion a mayusculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Palabra u oracion en MAYUSCULAS: " + textoMayusculas);

        //Extrayendo las vocales
        StringBuilder vocales = new StringBuilder();
        for (char caracter : texto.toCharArray()) {
            if (validandoVocal(caracter)) {
                vocales.append(caracter);
            }
        }

        System.out.println("Vocales encontradas: " + vocales.toString());

        scanner.close();
    }

    private static boolean validandoVocal(char v) {
        //Se convierte a minuscula para poder compararlo
        v = Character.toLowerCase(v);
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }
}
