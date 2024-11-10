import java.util.Date;

public class CuentaBancaria {

    double saldo;

    CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    void sacarDinero(int cantidad){

        if (cantidad <= 0) {
            System.out.println("Monto inválido");
            return;
        }else if (cantidad > saldo){
            System.out.println("Monto inválido");
            return;
        }
        saldo -= cantidad;

        System.out.println("El monto retirado en soles es: " + cantidad);
        System.out.println("El saldo actual es: " + saldo);
        Date objDate = new Date();
        System.out.println(objDate.toString());
    }

    double obtenerSaldo(){
    return saldo;
    }

}
