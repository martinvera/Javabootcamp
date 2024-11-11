package ejercicios.clases.tcs.ejercicio2;

public class EstacionesDelAnio {
    public void obtenerEstaciones(int estaciones){
        switch (estaciones){
            case 1 -> {
                if (estaciones == 1){
                    System.out.println("El verano se da en los siguientes meses: enero, febrero y marzo");
                }
            }
            case 2 -> {
                if (estaciones == 2){
                    System.out.println("El invierno llega en los siguientes meses: julio, agosto y septiembre");
                }
            }
            case 3 -> {
                if (estaciones == 3){
                    System.out.println("El otoño llega en los siguientes meses: abril, mayo y junio");
                }
            }
            case 4 -> {
                if (estaciones == 4){
                    System.out.println("La primeravera llega en los siguientes meses: octubre, noviembre y diciembre");
                }
            }
            default -> System.out.println("Escogió una opción incorrecta");
        }
    }
}
