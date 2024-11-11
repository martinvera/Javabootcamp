import java.math.BigDecimal;
import java.math.RoundingMode;

public class E5CalcularInteresPres {

    public static void main(String[] args) {
        CalculadoraPrestamo calc = new CalculadoraPrestamo();

        // Definir monto del préstamo
        BigDecimal prestamo = new BigDecimal("35500");
        System.out.println("Monto del préstamo: " + prestamo);

        // Calcular interés
        BigDecimal interes = calc.calcularInteres(prestamo);
        System.out.println("El interés es: " + interes);

        // Calcular IGV sobre el interés
        BigDecimal igv = calc.calcularIgv(interes);
        System.out.println("IGV del interés es: " + igv);
    }
}

class CalculadoraPrestamo {

    // Tasa de interés y tasa de IGV
    private static final BigDecimal TASA_INTERES = new BigDecimal("0.255");
    private static final BigDecimal TASA_IGV = new BigDecimal("0.18");

    // Método calcular el interés de un préstamo
    public BigDecimal calcularInteres(BigDecimal monto) {
        BigDecimal interes = monto.multiply(TASA_INTERES);
        interes = interes.setScale(2, RoundingMode.HALF_UP);
        return interes;
    }

    // Método para calcular el IGV sobre el interés
    public BigDecimal calcularIgv(BigDecimal montoInteres) {
        BigDecimal igv = montoInteres.multiply(TASA_IGV);
        igv = igv.setScale(2, RoundingMode.HALF_UP);
        return igv;
    }
}
