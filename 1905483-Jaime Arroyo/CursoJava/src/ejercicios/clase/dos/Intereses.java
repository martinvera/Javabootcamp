package ejercicios.clase.dos;

public class Intereses {

    public static void main(String[] args) {
        double prestamo = 35500;
        double tasa = 25.5;
        double igv = 18;

        // Calcula el Interes del Prestamo
        System.out.println("El calculo del Interes para el Prestamo por S/. " + prestamo + " es " + calcular(prestamo, tasa));

        // Calcula el IGV del Interes
        System.out.println("\nEl calculo del IGV para Interes S/. " + calcular(prestamo, tasa) + " es de " + calcular(calcular(prestamo, tasa), igv));
    }

   public static double calcular(double b, double t){
        return b * (t / 100);
    }
}
