import java.util.Scanner;

public class EstacionesAño {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta el numero del mes para saber la estación");
        System.out.println("1=Ene, 2=Feb, 3=Mar, 4=Abr, 5=May, 6=Jun");
        System.out.println("7=Jul, 8=Ago, 9=Set, 10=Oct, 11=Nov, 12=Dic");
        int numeromes = scanner.nextInt();
        String resultadoEstacion = "";
        String mes = " ";

        if (numeromes==12 || numeromes==1 || numeromes==2){
            resultadoEstacion="verano";
            System.out.println("En el mes " + numeromes+ " La estación es " + resultadoEstacion);
        } else if (numeromes==3 || numeromes==4 || numeromes==5) {
            resultadoEstacion="otoño";
            System.out.println("En el mes " + numeromes+ " La estación es " + resultadoEstacion);
        } else if (numeromes==6 || numeromes==7 || numeromes==8) {
            resultadoEstacion="invierno";
            System.out.println("En el mes " + numeromes+ " La estación es " + resultadoEstacion);
        }else if (numeromes==9 || numeromes==10 || numeromes==11){
            resultadoEstacion="primavera";
            System.out.println("En el mes " + numeromes+ " La estación es " + resultadoEstacion);
        }else{
            System.out.println("No es un numero válido");
        }


//        switch (numeromes){
//            case 12: mes = "Diciembre";
//            case 1: mes = "Enero";
//            case 2: mes = "Febrero";
//                resultadoEstacion = "Es verano";
//                System.out.println("El mes numero " + numeromes + " es el mes " + mes + " y nos encontramos en la estación " + resultadoEstacion);
//                break;
//            case 3: mes = "Marzo";
//            case 4: mes = "Abril";
//            case 5: mes = "Mayo";
//                resultadoEstacion = "Es Otoño";
//                System.out.println("El mes numero " + numeromes + " es el mes " + mes + " y nos encontramos en la estación " + resultadoEstacion);
//                break;
//            case 6: mes = "Junio";
//            case 7: mes = "Julio";
//            case 8: mes = "Agosto";
//                resultadoEstacion = "Es Invierno";
//                System.out.println("El mes numero " + numeromes + " es el mes " + mes + " y nos encontramos en la estación " + resultadoEstacion);
//                break;
//            case 9: mes = "Septiembre";
//            case 10: mes = "Octubre";
//            case 11: mes = "Noviembre";
//                resultadoEstacion = "Es Primavera";
//                System.out.println("El mes numero " + numeromes + " es el mes " + mes + " y nos encontramos en la estación " + resultadoEstacion);
//                break;
//            default:
//                System.out.println("No es un numero válido");
//        }
    }
}