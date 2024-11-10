package ejercicios.clases.tcs.Ejercicio4;

public class convertorPalabras {
    public void mayusculaExtractor(String palabra){
        String mayuscula = palabra.toUpperCase();

        StringBuilder vocales = new StringBuilder();
        for (char letra : palabra.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                vocales.append(letra);
            }
        }

        System.out.println("La palabra en mayusculas: " + mayuscula);
        System.out.println("Las vocales de la palabra: " + vocales);
    }
}
