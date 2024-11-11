public class Ejercicio5 {

    public static void main(String[] args) {
        double prestamo=35500.00;
        double interes=25.5; // en porcentaje
        double igv =18; //en porcentaje
        double montoInteres=0.00;
        double montoIgv =0.00;

        // montos con bigdecimal
        
        montoInteres = (prestamo * interes)/100;
        montoIgv = (montoInteres*igv)/100;

        System.out.println("el interés del " +interes+ "% de un préstamo de "+ prestamo+ " es: " +montoInteres);
        System.out.println("el igv del " +igv+ "% del interés calculado es: " +montoIgv);
    }

}
