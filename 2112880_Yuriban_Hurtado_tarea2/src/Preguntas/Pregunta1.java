package Preguntas;

public class Pregunta1 {
    public void calendario(){
        System.out.println("Días impares de noviembre: "); //Impresión de texto en pantalla
        for(int i=0; i<31; i++) { //Bucle for para recorrer los días de noviembre. Menor a 31 para que solo tome hasta el valor de 30
            if (i % 2 == 1) { //Si el módulo 2 del valor de "i" da como resultado 1, el resultado es impar
                System.out.println("Día " + i + " de Noviembre"); //Imprime el resultado concatenado con el texto
            }
        }
    }
}
