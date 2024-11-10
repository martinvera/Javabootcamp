package Ejercicio2;

public class Interes {
    public static void main(String[] args) {
        // instancia
        Interes intereces = new Interes();

        double prestamo = 35500;
        double tasaInteres = 25.5;
        double tasaIGV = 18.0;

        double interes = intereces.calcularInteres(prestamo, tasaInteres);
        double igv = intereces.calcularIGV(interes, tasaIGV);

        System.out.println("Interés calculado: " + interes);
        System.out.println("IGV sobre el interés: " + igv);
    }

    //método para calcular el interés
    public double calcularInteres(double monto, double tasa) {
        return monto * (tasa / 100);
    }

    public double calcularIGV(double monto, double tasa) {
        return monto * (tasa / 100);
    }
}
