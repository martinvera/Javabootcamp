package ejercicios.clases.tcs.Ejercicio5;

public class prestamoValida {
    private static final double INTERES = 0.255;
    private static final double IGV = 0.18;
    private static final double PRESTAMO = 35500.00;

    public void CalculaInteres(){
        System.out.println("Monto del prestamo: " + PRESTAMO);
        System.out.println("Porcentaje de interés: " + PRESTAMO * INTERES);
        System.out.println("IGV sobre el interés: " + (PRESTAMO * INTERES) * IGV);
    }
}
