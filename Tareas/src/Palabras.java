import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String palabra = scanner.next();
        System.out.println("la palabra ingresada en mayuscula es " + palabra.toUpperCase());
        for(int i = 0; i < palabra.length(); i++){
            String vocales = "aeiou";
            if(vocales.contains(String.valueOf(palabra.charAt(i)))){
                System.out.println("Vocal: " + palabra.charAt(i));
            }
        }
    }
}
