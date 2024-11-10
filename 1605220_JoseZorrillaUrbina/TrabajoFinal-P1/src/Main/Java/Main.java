import com.jazorrilla.Rutinas.ValidadorTarjeta;
import com.jazorrilla.Rutinas.interfaceRetiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Double importeSaldoInicial = 5500.88;
        final int factorTipoCambio = 4;

        String numTarjeta;
        String apenom;
        int    tipoMoneda;
        boolean tarjetaValida;

        Scanner scanner = new Scanner(System.in);

        ValidadorTarjeta validaTarjeta = new ValidadorTarjeta();
        interfaceRetiro interfaz = new interfaceRetiro(importeSaldoInicial, factorTipoCambio);

        System.out.println("Por favor identifiquese: ");
        do {
            System.out.println("    Ingrese el número de la Tarjeta ");
            numTarjeta = scanner.nextLine();
            tarjetaValida = validaTarjeta.validarTarjeta(numTarjeta);
            if (!tarjetaValida) {
                ;
            } else {
                break;
            }
        } while (true);

        System.out.println("    Ingrese su nombre y apellido");
        apenom = scanner.nextLine();

        System.out.println("Bienvenido " + apenom + ", usuario de la tarjeta " + numTarjeta);

        interfaz.retrasarAccion(5);

        tipoMoneda = interfaz.obtenerTipoMoneda();

        switch (tipoMoneda){
            case 1: {
                // Retiro en Soles
                interfaz.retirarSoles(importeSaldoInicial);
                break;
            }
            case 2:{
                // Retiro en US Dolares
                interfaz.retirarDolares(importeSaldoInicial, factorTipoCambio);
                break;
            }
        }

    }
}