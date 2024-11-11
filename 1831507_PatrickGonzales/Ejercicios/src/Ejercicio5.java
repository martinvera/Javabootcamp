public class Ejercicio5 {
    public static void main(String[] args) {
        //Definiendo los datos
        double prestamo = 35500;
        double tasaInteres = 25.5 / 100;
        double tasaIGV = 18.0 / 100;
        System.out.println(tasaIGV);

        //Calculando el interes
        double interes = prestamo * tasaInteres;
        System.out.println("Interés calculado: S/. " + interes);

        //Calculando el IGV
        double igv = tasaIGV * interes;
        System.out.println("IGV del interés: S/. " + igv);

        //Total mas IGV
        double totalConIGV = interes + igv;
        System.out.println("Total con IGV: S/. " + totalConIGV);
    }
}
