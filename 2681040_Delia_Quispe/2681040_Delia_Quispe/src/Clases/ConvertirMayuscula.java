package Clases;

import java.util.Scanner;

public class ConvertirMayuscula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar el nombre : ");
        String nombre;
        //char voc;
        nombre = input.nextLine();
        System.out.println("Nombre en mayuscula: " + nombre.toUpperCase());
        //voc= nombre.charAt(1);*/
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        String voc = "";
        int n_voc = 0;
        for (int i = 0; i < nombre.length(); i++) {
            for (int v = 0; v < vocales.length; v++) {
                if (nombre.charAt(i) == vocales[v]) {
                    n_voc++;
                    voc += nombre.charAt(i);
                }
            }
        }
        System.out.println("nombre ingresado: " + nombre);
        System.out.println("Contar vocales :(" + n_voc + ") vocales   :" + voc);

    }
}
