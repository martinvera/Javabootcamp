package TAREA2;
import java.util.Scanner;

public class ConversorTextoApp {
    public static void main(String[] args) {
        ConversorTexto conversor = new ConversorTexto();
        conversor.procesarTexto();
    }

    static class ConversorTexto {
        private Scanner scanner = new Scanner(System.in);

        // Método principal para convertir el texto y extraer vocales
        public void procesarTexto() {
            System.out.print("Ingrese una palabra o cadena de texto en minúsculas: ");
            String texto = scanner.nextLine();

            String textoMayusculas = convertirAMayusculas(texto);
            String vocales = extraerVocales(texto);

            System.out.println("Texto en mayúsculas: " + textoMayusculas);
            System.out.println("Vocales encontradas: " + vocales);
        }

        // Método para convertir el texto a mayúsculas
        private String convertirAMayusculas(String texto) {
            return texto.toUpperCase();
        }

        // Método para extraer vocales del texto
        private String extraerVocales(String texto) {
            StringBuilder vocalesEncontradas = new StringBuilder();
            for (char c : texto.toCharArray()) {
                if (esVocal(c)) {
                    vocalesEncontradas.append(c);
                }
            }
            return vocalesEncontradas.toString();
        }

        // Método auxiliar que verifica si un carácter es una vocal
        private boolean esVocal(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }
    }
}
