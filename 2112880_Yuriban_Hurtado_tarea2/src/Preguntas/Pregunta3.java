package Preguntas;

import java.util.Scanner;

public class Pregunta3 {

    public void mayusculasMinusculas(){
        Scanner ingreso = new Scanner(System.in);
        String palabra = ""; //Variable de tipo cadena
        String palabraMayuscula = ""; //Variable de tipo cadena
        System.out.println("Ingrese la palabra: "); //Pide ingresar la palabra por pantalla
        palabra = ingreso.next(); //El ingreso se guarda en la variable "palabra"
        palabraMayuscula = palabra.toUpperCase(); //Utilizo el método "toUpperCase" para convertir toda la palabra en mayúsculas
        System.out.println(palabraMayuscula);

        for(int i =0; i<palabraMayuscula.length();i++){ //Recorro con le bucle for. El bucle irá hasta el final de longitud de la palabra y el contador "i "avanzará más 1"
            if (palabraMayuscula.charAt(i)=='A'){ //El metodo "charAt()" toma la posición que indique el index (i) y lo iguala con el valor "A"
                System.out.println(palabraMayuscula.charAt(i)); //Si cumple la condición, imprime el texto
            } else if (palabraMayuscula.charAt(i)=='E') { //Si no cumple la primera condicional, pasa al "else-if" y lo iguala a "E"
                System.out.println(palabraMayuscula.charAt(i)); //Si cumple la condición, imprime el texto
            } else if (palabraMayuscula.charAt(i)=='I') { //Si no cumple la primera condicional, pasa al "else-if" y lo iguala a "I"
                System.out.println(palabraMayuscula.charAt(i)); //Si cumple la condición, imprime el texto
            } else if (palabraMayuscula.charAt(i)=='O') { //Si no cumple la primera condicional, pasa al "else-if" y lo iguala a "O"
                System.out.println(palabraMayuscula.charAt(i)); //Si cumple la condición, imprime el texto
            } else if (palabraMayuscula.charAt(i)=='U') { //Si no cumple la primera condicional, pasa al "else-if" y lo iguala a "U"
                System.out.println(palabraMayuscula.charAt(i)); //Si cumple la condición, imprime el texto
            }
        }
    }
}
