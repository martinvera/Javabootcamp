package TrabajoFinal;

public class Validaciones {
    private double numeroParseado;
    Constantes constantes = new Constantes();

    public boolean validarTarjeta(String numeroTarjeta){
        if (numeroTarjeta.length() == 16){
            try {
                Long.parseLong(numeroTarjeta);
                return true;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número correcto de tarjeta");
                return false;
            }
        }else {
            System.out.println("Ingrese un número correcto de tarjeta");
            return false;
        }
    }

    private boolean validarMonto(String montoRetirar){
        try {
            Double.parseDouble(montoRetirar);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un monto correcto");
            return false;
        }
    }

    public Double validarRetiroCuenta(String montoRetirar, int tipoMoneda, double montoInicial){
        if (validarMonto(montoRetirar)){
            numeroParseado = Double.parseDouble(montoRetirar);
            if (numeroParseado >= 0 & numeroParseado <= montoInicial){
                double montoConvertido = conversionMoneda(numeroParseado,tipoMoneda);
                if (montoConvertido <= montoInicial){
                    return montoInicial = montoInicial - montoConvertido;
                }else{
                    System.out.println("Monto superior al permitido");
                    return null;
                }
            }else{
                System.out.println("Monto no permitido");
                return null;
            }
        }else{
            return null;
        }
    }

    private double conversionMoneda(double montoRetirar, int tipoMoneda){
        if (tipoMoneda == 1){
            return montoRetirar;
        }else{
            return montoRetirar = montoRetirar * constantes.tipoCambio;
        }
    }
}
