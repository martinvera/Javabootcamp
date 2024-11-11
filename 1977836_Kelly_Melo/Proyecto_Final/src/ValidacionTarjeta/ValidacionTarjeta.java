package ValidacionTarjeta;

public class ValidacionTarjeta {

      private String numero;

    public boolean validartarjeta(String numero) {

        if (numero.length() < 16) {
            System.out.println("*** El nro de tarjeta ingresado es incorrecto contiene menos de 16 dígitos.");
            return false;
        }
        else if (numero.length() > 16){
            System.out.println("*** El nro de tarjeta ingresado es incorrecto contiene mas de 16 dígitos");
            return false;

        }

        if (!numero.matches("\\d+")) {
            System.out.println("*** El nro de tarjeta solo debe contener números.");
            return false;
        }

        return true;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

}
