import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {

     /*   2. Elaborar un programa en java que permita mostrar las estaciones del año
        (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de mes: ");
        int mes = sc.nextInt();
        String numeromes="";
        String estacion="";

        switch (mes) {
            case 1:
                numeromes = "Enero";
                estacion = "Verano";
                break;

            case 2:
                numeromes = "Febrero";
                estacion = "Verano";
                break;

            case 3:
                numeromes = "Marzo";
                estacion = "Otoño";
                break;

            case 4:
                numeromes = "Abril";
                estacion = "Otoño";
                break;

            case 5:
                numeromes = "Mayo";
                estacion = "Otoño";
                break;

            case 6:
                numeromes = "Junio";
                estacion = "invierrno";
                break;

            case 7:
                numeromes = "Julio";
                estacion = "invierrno";
                break;

            case 8:
                numeromes = "Agosto";
                estacion = "invierrno";
                break;

            case 9:
                numeromes = "Septiembre";
                estacion = "Primavera";
                break;
            case 10:
                numeromes = "Octubre";
                estacion = "Primavera";
                break;
            case 11:
                numeromes = "Noviembre";
                estacion = "Primavera";
                break;
            case 12:
                numeromes = "Diciembre";
                estacion = "Verano";
                break;
            default:
                System.out.println("Dato ingresado no es valido");

        }
System.out.println("El mes es: "+numeromes+ " y la estación es: "+estacion);
    }}