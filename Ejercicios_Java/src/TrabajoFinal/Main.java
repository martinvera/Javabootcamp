package TrabajoFinal;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validaciones validaciones = new Validaciones();
        LocalDate fechaActual = LocalDate.now();
        Double montoInicial = 5500.88;

        /*
        Elaborar un programa que simule un retiro de cajero automatico
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
        ceros soles) y montrar el saldo y fecha y hora de transaccion (7ptos)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número del tarjeta: ");
        String numeroTarjeta = scanner.next();
        if (validaciones.validarTarjeta(numeroTarjeta)){
            System.out.print("Ingresar nombre de usuario: ");
            String nombreUsuario = scanner.next();
            System.out.print("Ingresar apellido de usuario: ");
            String apellidoUsuario = scanner.next();
            while(montoInicial > 0){
            System.out.println("==================================");
            System.out.println("Ingresar el tipo de moneda que desea retirar: ");
            System.out.println("1. PEN");
            System.out.println("2. USD");
            int tipoMoneda = scanner.nextInt();
                if (tipoMoneda == 1 || tipoMoneda == 2) {
                    System.out.println("==================================");
                    System.out.print("Ingrese el monto que desea retirar: ");
                    String montoRetirar = scanner.next();
                    montoInicial = validaciones.validarRetiroCuenta(montoRetirar, tipoMoneda, montoInicial);
                    if (montoInicial != null) {
                        String moneda = (tipoMoneda == 1) ? "PEN" : "USD";
                        System.out.println("==================================");
                        System.out.println("Se realizó el retiro de manera correcta");
                        System.out.println("Usted retiró: " + montoRetirar + " " + moneda);
                        System.out.println("Cuenta con un saldo de: " + montoInicial);
                        System.out.println("Fecha de transacción: " + fechaActual);
                        System.out.println("==================================");
                        System.out.println("Desea realizar otra operación");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        int opcionContinuar = scanner.nextInt();
                        if (opcionContinuar == 2){
                            break;
                        }
                    }else{
                        System.out.println("Vuelva a intentarlo");
                        break;
                    }
                }else{
                    System.out.println("Tipo de moneda no pemitido");
                    break;
                }
            }
        }
    }
}
