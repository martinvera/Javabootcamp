package ProyectoFinal.Cajero;

import ProyectoFinal.Banco.Constantes;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajeroAutomatico tarjeta = new CajeroAutomatico();

        // Validación de número de tarjeta
        String numeroTarjeta = tarjeta.validarTarjeta();

        // Solicitar nombre y apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        //Instanciar Objeto
        CajeroAutomatico usuario = new CajeroAutomatico(nombre,apellido,numeroTarjeta, Constantes.SALDO_INICIAL);

        // Selección de moneda de retiro
        System.out.println("Seleccione la moneda de retiro:" + "\n1. Soles" + "\n2. Dólares");
        int opcionMoneda = usuario.monedaRetiro();
        double montoSolicitado = usuario.retirarSaldo(opcionMoneda);

        // Imprimir detalles de la transacción
        usuario.imprimirBoucher(opcionMoneda,montoSolicitado);
    }

}