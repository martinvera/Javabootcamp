
import java.util.Scanner;


public class CajeroAutomatico {

    CuentaBancaria cuentaBancariaActual;
    CajeroAutomatico(String contraseña,String contraseña2) {
        double cantidadAleatoria = 5500.88;
        cuentaBancariaActual = new CuentaBancaria(cantidadAleatoria);
    }

void mostrarSaldo(){
       System.out.println("Su saldo actual es: " + cuentaBancariaActual.obtenerSaldo());
}

void sacarDinero(){

        int opcionMoneda;

            System.out.println("Escriba 1 para retirar soles:");
            System.out.println("Escriba 2 para retirar dolares:");

        Scanner scanner = new Scanner(System.in);
        opcionMoneda = scanner.nextInt();

        if (opcionMoneda == 1){

        System.out.println("Por favor digitar monto en soles a retirar ");

        int cantidad = scanner.nextInt();
       // double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
/*
            System.out.println("El monto retirado en soles es: " + cantidad);
            System.out.println("El saldo actual es: " + cuentaBancariaActual.obtenerSaldo());
            Date objDate = new Date();
            System.out.println(objDate.toString());
 */
        }

        else if (opcionMoneda == 2){
            System.out.println("Por favor digitar monto en dólares a retirar ");
            int cantidad = scanner.nextInt();
          //  double cantidad = scanner.nextDouble();
            cantidad = cantidad*4;
            cuentaBancariaActual.sacarDinero(cantidad);
            }

            else {
            System.out.println("Opción de moneda no válido");
            }

    }

    public void salir() {
        System.out.println("Opción no válida, Muchas gracias");
    }
}
