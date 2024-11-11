package Actividad2;

public class CalcularPrestamo {
    public static void main(String[] args) {
        MetodoCalculoPrestamo presta= new MetodoCalculoPrestamo();
        presta.SolicitarPrestamo();
        presta.CalculInteres();
        presta.CalcularIGV();
        presta.ResultadoOperacion();

    }
}
