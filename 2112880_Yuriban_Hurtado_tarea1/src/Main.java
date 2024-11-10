import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in); //Se importa la clase "Scanner" para poder ingresar valores por pantalla


        //Pregunta 1

        System.out.println("Días impares de noviembre: "); //Impresión de texto en pantalla
        for(int i=0; i<31; i++) { //Bucle for para recorrer los días de noviembre. Menor a 31 para que solo tome hasta el valor de 30
            if (i % 2 == 1) { //Si el módulo 2 del valor de "i" da como resultado 1, el resultado es impar
                System.out.println("Día " + i + " de Noviembre"); //Imprime el resultado concatenado con el texto
            }
        }

        //Pregunta 3
        try {
            System.out.println("Ingreso un número: "); //Pide ingresar un número por pantalla al usuario
            double num1 = ingreso.nextDouble(); //Guarda el valor en la variable "num1"
            double num2 = 0;
            do { // Se realiza el bucle para evitar que el segundo valor (El divisor) se igual a "0". El bucle no dejará salir hasta que sea diferente de 0
                System.out.println("Ingreso un segundo número: "); //Pide ingresar un segundo número
                num2 = ingreso.nextDouble(); //Guarda el valor en la variable "num2"
            } while (num2 == 0);
            double suma = num1 + num2; // La variable "Suma" guarda el resultado de la suma de los dos número
            double resta = num1 - num2; // La variable "Resta" guarda el resultado de la resta de los dos número
            double division = num1 / num2; // variable "División" guarda el resultado de la división de los dos número
            System.out.println("Ingrese el valor de la potencia para ambos número: "); //Pide el ingreso de un valor de la potencia
            int potencia = ingreso.nextInt(); //Guarda el valor ingresado en una variable entera
            double potenciaNum1 = Math.pow(num1, potencia); //Utiliza el método "POW" de la clase "Math" para elevar el valor por el número ingresado en la variable "potencia"
            double potenciaNum2 = Math.pow(num2, potencia); //Utiliza el método "POW" de la clase "Math" para elevar el valor por el número ingresado en la variable "potencia"

            System.out.println("La suma de los números es: " + suma); //Impresión y concatenación
            System.out.println("La resta de los números es: " + resta); //Impresión y concatenación
            System.out.println("La división de los números es: " + division); //Impresión y concatenación
            System.out.println("La potencia del primer número es: " + potenciaNum1); //Impresión y concatenación
            System.out.println("La potencia del segundo número es: " + potenciaNum2); //Impresión y concatenación
        }catch (Exception e){
            System.out.println("El valor ingresado no es un número. Se termina el flujo");
        }


        //Pregunta 4
        String palabra = ""; //Variable de tipo cadena
        String palabraMayuscula = ""; //Variable de tipo cadena
        System.out.println("Ingrese la palabra: "); //Pide ingresar la palabra por pantalla
        palabra = ingreso.next(); //El ingreso se guarda en la variable "palabra"
        palabraMayuscula = palabra.toUpperCase(); //Utilizo el método "toUpperCase" para convertir toda la palabra en mayúsculas

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


        //Pregunta 5
        int prestamo = 35000; //Variable de tipo entero con valor 35000
        double interes = (prestamo*25.5)/100; //Variable de tipo double donde se realiza la operación
        double igv = (prestamo*18)/100; //Variable de tipo double donde se almacena el cálculo del IGV

        System.out.println("El préstamo es: " + prestamo); //Impresión de texto y concatenación de variable
        System.out.println("El interés del 25.5% es: " + interes); //Impresión de texto y concatenación de variable
        System.out.println("El IGV calculado es: " + igv); //Impresión de texto y concatenación de variable


        //Pregunta 6
        System.out.println("Ingresar el número: "); //Pide ingresar un número por pantalla al usuario
        int numeroIngreso = ingreso.nextInt(); //Guarda el valor que ingresa como entero en una variable entera
        if(numeroIngreso!=1 && numeroIngreso%2==1 || numeroIngreso==2){ //Se establece la codicional de que si el valor es diferente de 1 y su módulo da como resultado 1 o el número ingresado es igual a "2", imprime el texto"
            System.out.println("El número " + numeroIngreso + " es primo"); //Imprime el texto si se cumple la condición del IF
        }else{ //SINO
            System.out.println("El número " + numeroIngreso + " NO es primo"); //Imprime el texto si no se cumple la condición del "IF"
        }

        //Pregunta 2

        String[] primavera = {"Marzo","Abril","Mayo","Junio"}; //Se crea una lista llamada "Primavera" con sus valores
        String[] verano = {"Junio","Julio","Agosto","Setiembre"}; //Se crea una lista llamada "Verano" con sus valores
        String[] otoño = {"Setiembre","Octubre","Noviembre","Diciembre"}; //Se crea una lista llamada "Otoño" con sus valores
        String[] invierno = {"Diciembre","Enero","Febrero","Marzo"}; //Se crea una lista llamada "Invierno" con sus valores

        System.out.println("PRIMAVERA"); //Texto de cabecera
        System.out.println("---------"); //Subrayado
        for(int i=0; i<4; i++){ //Bucle for para recorrer la primera lista
            System.out.println(primavera[i]);} //Imprime el valor de la posición
        System.out.println("VERANO"); //Texto de cabecera
        System.out.println("------"); //Subrayado
        for(int x=0; x<4; x++){ //Bucle for para recorrer la segunda lista
            System.out.println(verano[x]);} //Imprime el valor de la posición
        System.out.println("OTOÑO"); //Texto de cabecera
        System.out.println("-----"); //Subrayado
        for(int y=0; y<4; y++){ //Bucle for para recorrer la tercera lista
            System.out.println(otoño[y]);} //Imprime el valor de la posición
        System.out.println("INVIERNO"); //Texto de cabecera
        System.out.println("--------"); //Subrayado
        for(int z=0; z<4; z++){ //Bucle for para recorrer la cuarta lista
            System.out.println(invierno[z]);} //Imprime el valor de la posición


    }

}