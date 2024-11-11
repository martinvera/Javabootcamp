import java.util.Scanner;

public class E4ConvertirMayusculas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConvertidorCadena convertidor = new ConvertidorCadena();

        System.out.println("Escribe una palabra o frase en minúsculas: ");
        String texto = sc.nextLine();

        // Convierte a mayúsculas
        String textoMayus = convertidor.convertirAMayusculas(texto);
        System.out.println("El texto en mayúsculas es: " + textoMayus);

        // Encuentra y muestra vocales
        String soloVocales = convertidor.extraerVocales(textoMayus);
        System.out.println("Las vocales son: " + soloVocales);

        sc.close();
    }
}

class ConvertidorCadena {

    // Convierte el texto a mayúsculas
    public String convertirAMayusculas(String texto) {
        String resultado = texto.toUpperCase();
        return resultado;
    }

    // Extrae las vocales de un texto en mayúsculas
    public String extraerVocales(String texto) {
        String vocalesEncontradas = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (esVocal(letra)) {
                vocalesEncontradas += letra + " ";
            }
        }
        return vocalesEncontradas;
    }

    // Chequea si un caracter es vocal
    private boolean esVocal(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
