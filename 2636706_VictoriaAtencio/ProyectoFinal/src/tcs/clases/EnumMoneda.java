package tcs.clases;

public enum EnumMoneda {
SOLES("1"), DOLARES("2");


    private final String numero;

    // Constructor para asociar un numero con cada valor del enum
    EnumMoneda(String numero) {
        this.numero = numero;
    }

    // Devuelve el numero asociado al valor de la moneda
    public  String getNumero(){
        return numero;
    }

    //Funcion que devuelve la moneda del número asociado
    public  static  EnumMoneda from(String numero){

        for (EnumMoneda enumMoneda: EnumMoneda.values()){
            if (enumMoneda.getNumero().equals(numero)){
                return enumMoneda;
            }
        }
        throw new IllegalArgumentException("Opción de moneda no valida. Ingresar 1 o 2.");
    }

}
