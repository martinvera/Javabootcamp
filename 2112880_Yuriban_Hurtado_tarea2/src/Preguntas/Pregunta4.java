package Preguntas;

public class Pregunta4 {

    public void intereses(){

        int prestamo = 35000; //Variable de tipo entero con valor 35000
        double interes = (prestamo*25.5)/100; //Variable de tipo double donde se realiza la operación
        double igv = (prestamo*18)/100; //Variable de tipo double donde se almacena el cálculo del IGV

        System.out.println("El préstamo es: " + prestamo); //Impresión de texto y concatenación de variable
        System.out.println("El interés del 25.5% es: " + interes); //Impresión de texto y concatenación de variable
        System.out.println("El IGV calculado es: " + igv); //Impresión de texto y concatenación de variable

    }
}
