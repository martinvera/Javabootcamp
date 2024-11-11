import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Solicita ingrese un una palabra
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        String palabraMayus = palabra.toUpperCase();
        imprimirVocal(palabraMayus);

    }

    public static void imprimirVocal(String palabra){
        // se puede utilizar el indexof.
            for (char c: palabra.toCharArray() ){
                if(c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'){
                    System.out.println("La vocal es:" + c);
                }
            }
    }
}
