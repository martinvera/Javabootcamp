package tcs.main;

import tcs.clases.Cuenta;
import tcs.clases.EnumMoneda;
import tcs.clases.Fecha;
import tcs.clases.Utiles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CajeroAutomatico {

    public static void main(String[] args) {


        try {
            //Pedir el numero de tarjeta y validar que sea numerico y de 16 numeros y
            //pedir el nombre y apellido (4ptos)

            String regex = "^\\d{4}(-\\d{4}){3}$";
            // Compilamos el patrón
            Pattern pattern = Pattern.compile(regex);

            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingrese número de tarjeta numerico de 16 digitos formato '9999-9999-9999-9999'");
            String numerotarjeta = scanner.nextLine();

            Matcher matcher = pattern.matcher(numerotarjeta);

            // Validamos si el número de tarjeta cumple con el patrón
            if (matcher.matches()) {
                System.out.println("El número de tarjeta es válido.");
            } else {
                System.out.println("El número de tarjeta no es válido.");
                System.exit(0);
            }


            System.out.println("Ingrese nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellidos:");
            String apellidos = scanner.nextLine();

            Cuenta cuenta = new Cuenta(numerotarjeta,nombre,apellidos);


            //Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo
            //de cambio 4 soles.
            //(La constante esta definida en la clase CajeroAutomatico)
            cuenta.imprimirConstantes();

            //Solicitar moneda de retiro (0.5 ptos) 1 soles o 2 dolares

            System.out.println("Ingrese la moneda de retiro");
            System.out.println("1. Soles");
            System.out.println("2. Dolares");
            String codmoneda = scanner.nextLine();
            EnumMoneda moneda;

            moneda = EnumMoneda.from(codmoneda);
            System.out.println("Ingreso el monto en "+ moneda + " a retirar:");

            //Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no
            //debe pasar el saldo de tarjeta y realizar la conversion si piden dolares y
            //restar el saldo

            String montoRetiro = scanner.nextLine();

            //luego de confirmar el retiro deben de imprimir el por pantalla el monto
            //retirado y el monto en letras (ejemplo si retira 1000 deber mostrar: mil con
            //ceros soles) y montrar el saldo y fecha y hora de transaccion
            BigDecimal montoRetiroBigDecimal = new BigDecimal(montoRetiro);

            if (montoRetiroBigDecimal.compareTo(BigDecimal.ZERO)>0){


                if (cuenta.saldoSuficiente(moneda, montoRetiroBigDecimal)){

                    cuenta.retiro(moneda, montoRetiroBigDecimal);

                    // Establecer la escala a 2 decimales con redondeo hacia abajo (HALF_DOWN)
                    BigDecimal saldo2decimales = cuenta.getSaldo().setScale(2, RoundingMode.HALF_DOWN);

                    System.out.println("El monto retirado es: " + Utiles.convertirMontoEnLetras((double)montoRetiroBigDecimal.doubleValue()) + " "+ moneda );
                    System.out.println("El saldo de la cuenta es: " + saldo2decimales + " SOLES");
                    System.out.println("Fecha y Hora de la transaccion: "+ Fecha.fechaHoraActual());
                }else{
                    System.out.println("Saldo insuficiente");
                }

            }else{
                System.out.println("Monto a retirar debe ser mayor a 0");
                System.exit(0);
            }


        }catch ( IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }


}

