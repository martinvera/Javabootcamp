package tcs.clases;

import java.math.BigDecimal;

public class Cuenta {
    String numeroTarjeta;
    String nombres;
    String apellidos;
    public static final BigDecimal SALDO_INICIAL= new BigDecimal("5500.88");
    public static final BigDecimal TIPO_CAMBIO= new BigDecimal("4");

    BigDecimal saldo= SALDO_INICIAL;
    public Cuenta(String numeroTarjeta, String nombres, String apellidos){
    this.numeroTarjeta = numeroTarjeta;
    this.nombres= nombres;
    this.apellidos= apellidos;

    }

     public void imprimirConstantes() {
        System.out.println("El saldo inicial es: " + SALDO_INICIAL);
        System.out.println("El tipo de cambio es: " + TIPO_CAMBIO);
    }

    public void retiro(EnumMoneda monedaRetiro, BigDecimal montoRetiroBigDecimal){


        if (saldoSuficiente(monedaRetiro,montoRetiroBigDecimal )) {

            switch (monedaRetiro){
                case  SOLES:
                    saldo = saldo.subtract(montoRetiroBigDecimal);
                    break;
                case DOLARES:
                    saldo = saldo.subtract(montoRetiroBigDecimal.multiply(TIPO_CAMBIO));
                    break;
            }
        }

    }

    public  boolean saldoSuficiente(Enum monedaRetiro, BigDecimal montoRetiro){

        boolean resultado=false;
        // Imprime 1 (num1 > num4)
        if (monedaRetiro == EnumMoneda.SOLES && saldo.compareTo(montoRetiro)==1 ) {
           resultado=true;
        } else if (monedaRetiro == EnumMoneda.DOLARES && saldo.compareTo(montoRetiro.multiply(TIPO_CAMBIO))==1) {
            resultado=true;
        }
        return  resultado;
    }
    public BigDecimal getSaldo(){
        return saldo;
    }


}
