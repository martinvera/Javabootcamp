public enum OpcionCalculadora {
    SUMAR(1),
    RESTAR(2),
    MULTIPLICAR(3),
    DIVIDIR(4),
    POTENCIA(5);


    private final int numeroOpcion;

    // Constructor del enum que asocia el mes con un número
    OpcionCalculadora(int numero) {
        this.numeroOpcion = numero;
    }

    // Método para obtener el número del mes
    public int getNumero() {
        return this.numeroOpcion;
    }


}
