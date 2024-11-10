public class E2EstacionesAño {

    public static void main(String[] args) {
        Estacion estacion = new Estacion();
        estacion.mostrarEstaciones();
    }
}

class Estacion {

    public void mostrarEstaciones() {
        System.out.println("Estaciones del año y sus meses correspondientes:");

        System.out.println("Primavera: Septiembre, Octubre, Noviembre");
        System.out.println("Verano: Diciembre, Enero, Febrero");
        System.out.println("Otoño: Marzo, Abril, Mayo");
        System.out.println("Invierno: Junio, Julio, Agosto");
    }
}
