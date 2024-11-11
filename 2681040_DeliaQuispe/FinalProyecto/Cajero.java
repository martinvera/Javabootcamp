package FinalProyecto;

public class Cajero {
    public static void main(String[] args)
    {
        //inicializamos la clase tarjeta
        ValidarNumeroDeTarjeta tarjeta= new ValidarNumeroDeTarjeta();
        tarjeta.ValidarNumeroTarjeta();
        //inicializamos la cliente
        Cliente cliente= new Cliente();
        cliente.PedirNombreCliente();
        cliente.MostrarNombreCliente();
    //inicializamos la clase de banco
        Banco banco = new Banco();
        banco.selecionarTipoDeMoneda();
        banco.SolicitarMontoRetiroValidar();
        banco.MostrarMontoRetiradoSaldoRestante();

    }
}
