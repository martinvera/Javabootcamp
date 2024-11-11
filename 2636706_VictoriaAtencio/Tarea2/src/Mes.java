public enum Mes {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);

    private final int numero;

    // Constructor del enum que asocia el mes con un número
    Mes(int numero) {
        this.numero = numero;
    }

    // Método para obtener el número del mes
    public int getNumero() {
        return this.numero;
    }
}
