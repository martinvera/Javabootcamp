package clases;

public class estacionesDelAño {

    /*2. Elaborar un programa en java que permita mostrar las estaciones del año
    (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla. */

    String mes1;
    void MostrarEstacionAño(String mes){

        mes1 = mes.toUpperCase();

        switch (mes1){
            case "DICIEMBRE", "ENERO", "FEBRERO" :
                System.out.println("PARA EL MES DE " + mes1 + " LA ESTACION ES VERANO");
                break;

            case  "MARZO", "ABRIL", "MAYO" :
                System.out.println("PARA EL MES DE " + mes1 + " LA ESTACION ES OTOÑO");
                break;

            case "JUNIO", "JULIO", "AGOSTO" :
                System.out.println("PARA EL MES DE " + mes1 + " LA ESTACION ES INVIERNO");
                break;

            case "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE" :
                System.out.println("PARA EL MES DE " + mes1 + " LA ESTACION ES PRIMAVERA");
                break;

            default:
                System.out.println("EL MES INGRESADO ES INVALIDO");
        }
    }


}
