package clases;

public class cadenaDeTexto {
    /* 4. Elaborar un programa en java que permita convertir un palabra o cadena de texto en
       minúsculas a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra
       o cadena de texto y mostrarlo en pantalla */

    public void ExtraerCaracter (String texto){

        String mayuscula = texto.toUpperCase();
        System.out.println("Texto en Mayuscula: " +mayuscula);

        for (int i = 0; i < mayuscula.length(); i++) {
          char  vocal = mayuscula.charAt(i);
            if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U'){

                System.out.println("Las vocal extraída es : " + vocal);

            }


        }

    }
}
