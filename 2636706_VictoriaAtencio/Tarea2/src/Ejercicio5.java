import java.math.BigDecimal;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita calcular
        // el interés del 25.5 % de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.

        BigDecimal prestamo = new BigDecimal("35500.00");
        BigDecimal tasainteres = new BigDecimal("25.5");
        BigDecimal tasaigv = new BigDecimal("18");
        BigDecimal montoInteres = new BigDecimal("0.00");
        BigDecimal montoIgv= new BigDecimal("0.00");

        // montos con bigdecimal

        montoInteres = interes(prestamo,tasainteres);
        montoIgv = igv(montoInteres,tasaigv);

        System.out.println("el interés del " +tasainteres+ "% de un préstamo de "+ prestamo+ " es: " +montoInteres);
        System.out.println("el igv del " +tasaigv+ "% del interés calculado es: " +montoIgv);


    }

    public  static BigDecimal interes(BigDecimal monto, BigDecimal tasaInteres) {
        BigDecimal interes = monto.multiply(tasaInteres).divide(new BigDecimal("100"));
        return interes;
    }

    public  static BigDecimal igv(BigDecimal monto, BigDecimal tasaIGV) {
        BigDecimal igv = monto.multiply(tasaIGV).divide(new BigDecimal("100"));
        return igv;
    }

}
