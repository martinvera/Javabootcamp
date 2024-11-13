import java.util.Scanner;
import java.util.Date;

public class CajeroAutomatico {
    //Atributos de la Clase
    String tarjeta;
    String titular;
    double saldo = 5500.88;

    int moneda, x;
    double monto;
    double tipoCambio [] = {1.00, 4.00};

    Scanner caja = new Scanner(System.in);

    public void retirarDinero() {
        System.out.println("\n\t\tRETIRAR DINERO");
        System.out.println("\t\t------- ------\n");
        // Validar Datos de Tarjeta
        validarDatos();
        System.out.println("Ingrese su Nombre");
        titular = caja.nextLine();
        x = 0;
        do {
            System.out.println("Ingrese Moneda 1=Soles, 2=Dolares");
            moneda = caja.nextInt();
            if (moneda != 1 && moneda != 2)
                x = 0;
            else x = 1;
        } while (x == 0);
        x = 0;
        do {
            System.out.println("Ingrese Monto a Retirar");
            monto = caja.nextDouble();
            if (monto > saldo)
                System.out.println("Saldo Insuficiente, Ingrese un monto menor");
            else { //imprimeVoucher();
                saldo -= monto*tipoCambio[moneda-1];
                imprimirVoucher();
                x = 1;
            }
        }while (x == 0);
    }

    public void consultarSaldo() {
        System.out.println("\n\t\tCONSULTAR SALDO");
        System.out.println("\t\t--------- -----\n");
        validarDatos();
        System.out.println("\nEl saldo actual es: " + saldo);
    }

    public void validarDatos(){
        x = 0;
        tarjeta = "";
        do {
            System.out.println("Ingrese su Tarjeta");
            tarjeta = caja.nextLine();
            // Tenga solo 16 digitos
            if (tarjeta.length() != 16) {
                System.out.println("\nTarjeta no tiene los 16 digitos");
                x = 0;
            }else{//Solo acepta numeros
                for (int i = 0; i < tarjeta.length(); i++) {
                    if (!Character.isDigit(tarjeta.charAt(i))){
                        System.out.println("\nSolo se acepta numeros");
                        x = 0;
                        break;
                    }else x = 1;
                }
            }
        } while (x == 0);
    }

    public void imprimirVoucher(){
        Date myDate = new Date();

        System.out.println("--------------------------------------\n");
        System.out.println("\n\t\tVOUCHER DEL RETIRO");
        System.out.println("--------------------------------------\n");
        System.out.println("Fecha.................: " + myDate);
        System.out.println("Numero de Tarjeta.....: " + tarjeta);
        System.out.println("Titular...............: " + titular);
        System.out.println("Moneda del Retiro.....: " + (moneda == 1 ? " Soles" : " Dolares") + "  T/C: " + tipoCambio[moneda-1]);
        System.out.println("Monto del Retiro......: " + monto);
        System.out.println("Saldo en Cuenta.......: " + saldo);
        System.out.println("--------------------------------------\n");
    }
}
