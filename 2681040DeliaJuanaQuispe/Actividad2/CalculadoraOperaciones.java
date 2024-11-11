package Actividad2;

public class CalculadoraOperaciones {
    public static void main(String[] args) {
        OperacionesNumericas op= new OperacionesNumericas();
        op.PedirNumero(); // invoca el metodo PedirNUmero
        op.resta();
        op.suma();
        op.multiplicacion();
        op.division();
        op.muestraResultados();
        op.potencia();
    }
}
