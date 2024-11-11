public class DatosCliente {
    String nombresyApellidos;
    String placa;
    double saldoTarjeta;

    void ImprimirSaldoTarjeta (double saldo) {
        System.out.println("Saldo de Tarjeta: " + saldo);
    }

    void deducirSaldo (double totalPagarCombustible){
        saldoTarjeta -= totalPagarCombustible;
    }


}
