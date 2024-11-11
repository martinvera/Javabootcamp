public class CalcularInteres {
    public static void main(String[] args) {
        Double monto = 35_500.00;
        Double interes = 0.255;
        Double interesPrestamos = (monto * interes);
        Double igv = 0.18;
        Double total = monto + interesPrestamos;
        Double igvInteresPrestamo = igv * interesPrestamos;
        System.out.println ("El monto total de prestamos + interés es: " + total);
        System.out.println ("El igv del interés es: " + igvInteresPrestamo);

    }
}
