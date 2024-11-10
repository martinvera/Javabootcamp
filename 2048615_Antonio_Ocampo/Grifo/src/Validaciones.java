public class Validaciones {

    public static boolean validaPlaca(String placa){
        boolean valido = true;

        if(placa.length() != 6){
            valido = false;
        }

        if(!placa.substring(0, placa.length()).matches("[0-z]*")){
                    valido = false;
        }

        return valido;
    }
    public static boolean validaNumerosEnteros(String numero){
        boolean valido = true;
        if(!numero.substring(0, numero.length()).matches("[0-9]*")){
            valido = false;
        }
        return valido;
    }
    public static boolean validaTipoCombustible(int opcion, int rango1, int rango2){
        boolean valido = true;

        if(opcion < rango1 || opcion > rango2){
            valido = false;
        }


        return valido;
    }
}
