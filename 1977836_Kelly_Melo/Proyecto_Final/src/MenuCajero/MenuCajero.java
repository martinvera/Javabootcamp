package MenuCajero;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ValidacionTarjeta.ValidacionTarjeta;
import OperacionSaldo.OperacionSaldo;
import Conversion.Conversion;

public class MenuCajero {
    /*ID:1977836
      Datos: Kelly Susan Melo Diaz
      Ejercicio 1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidacionTarjeta tarjeta = new ValidacionTarjeta();
        OperacionSaldo cuenta = new OperacionSaldo(tarjeta);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Información: La tarjeta debe contener solo 16 números(dígitos)");
        System.out.println("------------------------------------------------------------------");
        System.out.print("Ingrese el Nro de su tarjeta: ");
        String nrotarjeta = scanner.nextLine();

        while (!tarjeta.validartarjeta(nrotarjeta)) {
               System.out.println("Por favor, vuelva a ingresar un número válido.");
               System.out.println("------------------------------------------------------------------");
               System.out.print("Ingrese el Nro de su tarjeta: ");
               nrotarjeta = scanner.nextLine();
        }
        tarjeta.setNumero(nrotarjeta);

        System.out.print("Ingrese sus nombres y apellidos: ");
        String datos= scanner.nextLine();

        boolean salir = false;
        while (!salir) {

            System.out.println("------------------Cajero Automático--------------------");
            System.out.println("Ingrese por favor la opción a realizar:");
            System.out.println("OPCIÓN             REALIZAR");
            System.out.println("(1)............... Retirar dinero");
            System.out.println("(2)............... Mostrar saldo");
            System.out.println("(3)............... Salir");
            System.out.println("-------------------------------------------------------");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarRetiro(scanner, cuenta);
                    break;
                case 2:
                    cuenta.mostrarsaldo();
                    break;
                case 3:
                    System.out.println("Está saliendo del sistema cajero...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, vuelva a ingresar opción.");
            }
        }

        scanner.close();
    }


    private static void realizarRetiro(Scanner sc, OperacionSaldo cuenta) {
        Scanner scanner = new Scanner(System.in);
        //BigDecimal a= scanner.nextBigDecimal();

        System.out.println("Ingrese la opción del Tipo de Moneda a Retirar:");
        System.out.println("OPCIÓN                TIPO");
        System.out.println("( 1 ).................Soles");
        System.out.println("( 2 ) ................Dólares");
        System.out.println("Ingrese la opción para retirar 1 o 2:");
        int moneda= scanner.nextInt();

        System.out.print("Ingrese el monto a retirar: ");
        BigDecimal retiro= scanner.nextBigDecimal();
        while (!cuenta.validarmonto(retiro)) {
            System.out.print("Monto inválido. Ingrese un monto mayor que 0 y menor o igual al saldo disponible: ");
            retiro = scanner.nextBigDecimal();

        }

        Conversion transaccion = new Conversion(retiro, moneda == 1 ? "soles" : "dólares");
        System.out.println("El retiro realizado es:");
        System.out.println("En números: "  + OperacionSaldo.formatomoneda(retiro)+ (moneda == 1 ? " soles" : " dólares"));
        System.out.println("En letras: " + transaccion.Conversionaletras());

        if (moneda == 2) {
            retiro = retiro.multiply(OperacionSaldo.tipocambio).setScale(2, RoundingMode.HALF_UP); // Convertir a soles
            System.out.println("Retiró el equivalente a "+OperacionSaldo.formatomoneda(retiro)+" soles.\n");
        } else if (moneda != 1) {
            System.out.println("Opción inválida. Por favor volvera a ingresar la opción");
        }
        cuenta.restarsaldo(retiro);
        cuenta.mostrarsaldo();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaHora = formato.format(new Date());
        System.out.println("Transacción realizada el día: " + fechaHora);


    }
}

