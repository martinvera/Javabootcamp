package cajero;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CajeroAutomatico {


    final double SaldoInicial = 5500.88;
    final int TipoCambio = 4;


    private double SaldoDolares (){
        double SaldoDolar = SaldoInicial / TipoCambio;
        return SaldoDolar;
    }

    void RetirarMonto(int moneda){

        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter ResultadoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaFinal = ResultadoFecha.format(fecha);

        Scanner val = new Scanner(System.in);

            if (moneda == 1){
            System.out.println("Su saldo en soles es de: " +SaldoInicial);
            System.out.println("Ingrese el monto a retirar:");
            double Soles = val.nextDouble();
                    if (Soles > 0 && Soles <= SaldoInicial) {
                        double resta = SaldoInicial - Soles;
                        System.out.println("Usted esta retirando: " + Soles);
                        System.out.println("Fecha y hora de transacción: " + fechaFinal);
                        System.out.println("Saldo Restante: " + resta);
                    } else {
                        System.out.println("El monto a retirar debe ser mayor a 0 y menor a " + SaldoInicial);
                    }
            }else if (moneda == 2) {
                System.out.println("Su Saldo en Dolares es de: " + SaldoDolares());
                System.out.println("Ingrese el monto a retirar:");
                double dolares = val.nextDouble();

                    if (dolares > 0 && dolares <= SaldoDolares()) {
                        double dolarFinal = SaldoDolares() - dolares;
                        System.out.println("Usted esta retirando: " + dolares);
                        System.out.println("Fecha y hora de transacción: " + fechaFinal);
                        System.out.println("Saldo Restante: " + dolarFinal);
                    } else {
                        System.out.println("El monto a retirar debe ser mayor a 0 y menor a " + SaldoDolares());
                    }

            } else {
                System.out.println("Moneda invalida, inténtelo mas tarde");

            }



    }
}
