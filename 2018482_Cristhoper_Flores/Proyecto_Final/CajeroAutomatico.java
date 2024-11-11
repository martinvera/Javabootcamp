
/*1. Elaborar un programa que simule un retiro de cajero automatico
-Pedir el numero de tarjeta y validar que sea numerico y de 16 numeros y
pedir el nombre y apellido (4ptos)
-Guardar en una constante el monto de saldo inicial :5500.88 soles y tipo
de cambio 4 soles. (0.5 soles)
-Solicitar moneda de retiro (0.5 ptos) 1 soles o 2 dolares
-Solicitar monto a retirar y validar que no sea negativo y mayor a cero y no
debe pasar el saldo de tarjeta y realizar la conversion si piden dolares y
restar el saldo (8ptos)
-luego de confirmar el retiro deben de imprimir el por pantalla el monto
retirado y el monto en letras (ejemplo si retira 1000 deber mostrar: mil con
ceros soles) y montrar el saldo y fecha y hora de transaccion (7ptos)*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CajeroAutomatico {

    public static final double SALDO_INICIAL = 5500.88;
    public static final double TIPO_CAMBIO = 4.00;
    public static double saldo = SALDO_INICIAL;  
    private static final String[] unidades = {
        "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
        "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte"
    };

    private static final String[] decenas = {
        "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };

    private static final String[] centenas = {
        "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        String tarjeta = validacionTarjeta(scanner);        
        System.out.print("Ingresa su nombre: ");
        String nombre= scanner.nextLine();
        System.out.print("Ingresa su apellido: ");
        String apellido= scanner.nextLine();    
        int tipoMoneda= validarMoneda(scanner);
        double retiro = OperacionRetirar(tipoMoneda,scanner);
        BigDecimal saldoFinal = new BigDecimal(saldo).setScale(2,RoundingMode.HALF_UP);
        String retiroTexto= Mensaje(retiro,tipoMoneda);
        LocalDateTime estructurafechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHora = estructurafechaHora.format(formatter);
        System.out.println("\nEl usuario: " + nombre +" "+ apellido + " con numero de tarjeta: " + tarjeta);
        System.out.println(retiroTexto);
        System.out.println("Su saldo actual es: " + saldoFinal + "  con Fecha y Hora: " + fechaHora);

        scanner.close();
    }
    public static String validacionTarjeta(Scanner scanner){                
        String numeroTarjeta;     
        do{
            System.out.print("Ingresa el número de tarjeta: ");
             numeroTarjeta = scanner.nextLine();
            if (numeroTarjeta.matches("\\d{16}")) {
                //System.out.println("Tarjeta ingresada correctamente");
                break;
            } else {
                System.out.println("¡Error! Tarjeta debe tener 16 numeros.");            
            } 
        }while(true);
       return numeroTarjeta;
       
    }
    public static int validarMoneda(Scanner scanner){                      
        int moneda;         
        do{
            System.out.print("Retirar: \n 1.Soles \n 2.Dolares \n" );
             moneda = scanner.nextInt();
            if (moneda == 1 || moneda == 2) {
                //System.out.println("Moneda ingresada correctamente");
                break;
            } else {
                System.out.println("¡Error! El tipo de moneda no es valido.");            
            } 
        }while(true);
       return moneda;
    } 
    public static double OperacionRetirar(int moneda,Scanner scanner){               
        double montoRetiro;         
        do{
            System.out.print("Ingrese el monto a retirar:" );
             montoRetiro = scanner.nextDouble();
             if(montoRetiro <= 0 || montoRetiro > saldo){
                 System.out.println("¡ERROR! El monto ingresado no es valido");
             }else if(moneda == 2){
                montoRetiro = montoRetiro * TIPO_CAMBIO;
                if (montoRetiro < saldo) {
                    saldo = saldo - montoRetiro;
                    montoRetiro =montoRetiro / TIPO_CAMBIO;
                    break;
                }else System.out.println("¡ERROR! El monto ingresado no es valido");  
            }else{
                if ( montoRetiro < saldo) {
                    saldo = saldo - montoRetiro;
                    break;
                }    
            }            
        }while(true);
        return montoRetiro;
    } 
    public static String convertirTexto(int retiro) {
        if (retiro == 0) {
            return "cero";         
        } if (retiro == 100) {
            return "Cien";         
        } else if (retiro < 21) {
            return unidades[retiro];
        } else if (retiro < 100) {
            return decenas[retiro / 10] + (retiro % 10 != 0 ? " y " + unidades[retiro % 10] : "");
        } else if (retiro < 1000) {
            return centenas[retiro / 100] + (retiro % 100 != 0 ? " " + convertirTexto(retiro % 100) : "");
        } else if (retiro < 1000000) {
            return (retiro / 1000 == 1 ? "mil" : convertirTexto(retiro / 1000) + " mil") + (retiro % 1000 != 0 ? " " + convertirTexto(retiro % 1000) : "");
        } else {
            return "Número fuera de rango";
        }
    }
    public static String Mensaje(double retiro ,int tipoMoneda){
        BigDecimal valorRetiro = new BigDecimal(retiro);
        valorRetiro = valorRetiro.setScale(2, RoundingMode.HALF_UP);  
        int enteroRetiro = valorRetiro.intValue();  
        int decimalRetiro = valorRetiro.subtract(new BigDecimal(enteroRetiro)).multiply(new BigDecimal(100)).intValue();  

        String mostrarTexto;
        String monedaTexto = (tipoMoneda == 2) ? "Dolares" : "Soles";
    
        mostrarTexto = "Realizó el retiro de: " + convertirTexto(enteroRetiro);
        if (decimalRetiro > 0) {
            mostrarTexto += " con " + convertirTexto(decimalRetiro) + " " + monedaTexto;
        }else mostrarTexto += " " + monedaTexto;
        
        return mostrarTexto;
    }
}