package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ejercicio 1 Días Impares */

//        diasImpares ejec = new diasImpares();
//        ejec.Monstrar_Días_Impares();



        /* Ejercicio 2 Ingresar mes */

//        System.out.println("Ingrese el mes a consultar:");
//        String mess = sc.nextLine();
//        estacionesDelAño est = new estacionesDelAño();
//        est.MostrarEstacionAño(mess);



        /* Ejercicio 3 calculador */

//        calcularMate cal = new calcularMate();
//        System.out.println("Ingrese 2 numeros:");
//        int val1 = sc.nextInt();
//        int val2 = sc.nextInt();
//
//        System.out.println("La suma de: " + val1 + "+" + val2 + " es " + cal.CalcularSuma(val1,val2));
//        System.out.println("La resta de: " + val1 + "-" + val2 + " es " + cal.CalcularResta(val1, val2));
//        System.out.println("La division de: " + val1 + "/" + val2 + " es " + cal.CalcularDivision(val1, val2));
//        System.out.println("La potencia de: " + val1 + " elevado a " + val2 + " es " + cal.CalcularPotencia(val1, val2));



        /* Ejercicio 4 Cadena de Texto*/

//        cadenaDeTexto cadena = new cadenaDeTexto();
//        System.out.println("Ingrese una palabra: ");
//        String texto = sc.nextLine();
//        cadena.ExtraerCaracter(texto);



        /* Ejercicio 5 Interes Calculado*/

//        interesPrestamo in = new interesPrestamo();
//        int valor1 = (int) (in.prestamo * 1000);
//        double porcentaje = in.interes * 100;
//        System.out.println("El interes calculado de " + valor1 + " en su " + porcentaje + "% es de: " + in.interesCalculado() * 1000);
//        int valor2 = (int) (in.igv * 100);
//        System.out.println("El igv calculado de " + in.interesCalculado() * 1000 + " en su " + valor2 + "% es de: " + in.igvCalculado() * 1000);



        /* Ejercicio 7 obtener día de fecha*/
        System.out.println("Ingrese la fecha con el siguiente formato YYYY-MM-DD");
        String fecha = sc.nextLine();

        diaFecha dia = new diaFecha();
        dia.obtenerDia(fecha);
    }
}
