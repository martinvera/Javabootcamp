package ejercicios.clase.uno;

public class Estaciones {
    public static void main(String[] args) {
        //Definición de Variable
        int mes = 1;
        int dia = 25;
        String estacion = "";

        switch (mes) {
            case 1: case 2:
                estacion = "Verano";
                break;
            case 3:
                estacion = (dia<20)?"Verano":"Otoño";
                break;
            case 4: case 5:
                estacion = "Otoño";
                break;
            case 6:
                estacion = (dia<20)?"Otoño":"Invierno";
                break;
            case 7: case 8:
                 estacion = "Invierno";
                 break;
            case 9:
                 estacion = (dia<20)?"Invierno":"Primavera";
                 break;
            case 10: case 11:
                 estacion = "Primavera";
                 break;
            case 12:
                 estacion = (dia<20)?"Primavera":"Verano";
                 break;
        }
        System.out.println("La Estación es: " + estacion);
    }
}
