package exercice1;

public enum Moneda {
    SOLES("1"),
    DOLARES("2");

    private final String idMoneda;

    Moneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getIdMoneda() {
        return idMoneda;
    }

    // Método para obtener el enum Moneda a partir de un id
    public static Moneda from(String id) {
        for (Moneda moneda : Moneda.values()) {
            if (moneda.getIdMoneda().equals(id)) {
                return moneda;
            }
        }
        throw new IllegalArgumentException("Opción inválida. Debe ser 1 o 2.");
    }
}
