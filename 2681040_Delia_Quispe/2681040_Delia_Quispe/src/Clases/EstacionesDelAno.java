package Clases;

public class EstacionesDelAno {
    public static void main(String[] args) {

        int m = 12;
        String estacion = "", mes = "";
        //for(m=1; m<=12; m++);
        switch (m) {
            case 12:
                mes = "Diciembre";
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
                estacion = "Verano";
                break;
            case 3:
                mes = "Marzo";
            case 5:
                mes = "Mayo";
            case 4:
                mes = "Abril";
                estacion = "Otoño";
                break;
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
                estacion = "Invierno";
                break;
            case 9:
                mes = "Septiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
                estacion = "Primavera";
                break;
            default:
                System.out.println("El mes de " + mes + " no se encuentra en la estación " + estacion);
                break;
        }
        System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
    }
}