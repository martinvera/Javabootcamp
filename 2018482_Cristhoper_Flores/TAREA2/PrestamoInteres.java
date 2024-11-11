// 5. Elaborar un programa en java que permita calcular el interés del 25.5 % de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Ejercicio5 {

    public static BigDecimal calcularInteres(BigDecimal prestamo, BigDecimal interes){    
        BigDecimal porcentaje = new BigDecimal(100);     
        return (prestamo.multiply(interes.divide(porcentaje))).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calcularIgv(BigDecimal interesGanado, BigDecimal igv){ 
        BigDecimal porcentaje2 = new BigDecimal(100);       
        return (interesGanado.multiply(igv.divide(porcentaje2))).setScale(2, RoundingMode.HALF_UP);
    }
    public static void main(String[] args) {
        BigDecimal prestamo = new BigDecimal(35500);
        BigDecimal interes = new BigDecimal(25.5);
        BigDecimal igv = new BigDecimal(18);
        BigDecimal interesGanado = calcularInteres(prestamo, interes);
        BigDecimal igvDelInteres= calcularIgv(interesGanado, igv);
        System.out.println("El interes calculado del prestamo es : "+ interesGanado +" \nEl IGV del interes calculado es:  "+igvDelInteres ) ;

    }
    
}
