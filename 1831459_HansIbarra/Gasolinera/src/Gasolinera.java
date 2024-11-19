import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Gasolinera {
    public static void main(String[] args) {
        String nombre;
        double montoCombustible;
        double saldo = 1250.44;
        double[] precioGalonCombustible = {19.40, 16.80,9.50};
        String tipo = " ";
        int tipoCombustible=0;
        double precio= 0;
        double saldoTarjeta=0;
        int metodoPago = 0;
        double galon= 0;

        /*Solicita información de la placa
        Debe tener 6 caracteres alfanumericos*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la PLACA VEHICULAR: ");
        String placa = scanner.nextLine();
        while (placa.length() != 6 || placa.matches("[A-Z]{3}-[0-9]{3}")) {
            System.out.println("Por favor ingrese 3 Letras al inicio y 3 numeros al final");
            placa = scanner.nextLine();
        }

        /*Solicita nombre usuario*/
        System.out.println("Escriba el nombre del cliente: ");
        nombre = scanner.nextLine();

        /*Solicita tipo de combustible*/
        System.out.println("Indique el tipo de combustible: ");
        System.out.println("1 : Premium");
        System.out.println("2 : Regular");
        System.out.println("3 : Diesel");
        tipoCombustible = scanner.nextInt();
        switch (tipoCombustible) {
            case 1 -> {
                tipo = "Premium";
                precio = precioGalonCombustible[0];
            }
            case 2 -> {
                tipo = "Regular";
                precio = precioGalonCombustible[1];
            }
            case 3 -> {
                tipo = "Diesel";
                precio = precioGalonCombustible[2];
            }
            default -> {
                System.out.println("La opción indicada no es correcta");
                tipoCombustible = scanner.nextInt();
            }
        }

        /* Cantidad de carga combustible */
        System.out.println("Indique la cantidad deseada en SOLES");
        System.out.println("Tanque lleno/Tope: S/ 300 Soles");
        montoCombustible = scanner.nextDouble();
        //Sale saldo final de tarjeta
        if (montoCombustible==300){
            System.out.println("Cantidad máxima elegida");
            saldoTarjeta = saldo - montoCombustible;
        }else if (montoCombustible < 300){
            System.out.println("Procesando " + montoCombustible);
            saldo = saldo - montoCombustible;
        }else{
            System.out.println("Cantidad invalida.");
            System.out.println("Indique la cantidad deseada en SOLES");
            System.out.println("Tanque lleno/Tope: S/ 300 Soles");
            montoCombustible = scanner.nextDouble();
        }

        //Preguntar método de pago
        System.out.println("Eligir método de pago");
        System.out.println("Pago con Efectivo: 1");
        System.out.println("Pago con Tarjeta: 2");
        metodoPago = scanner.nextInt();
        String opcionPago;
        switch (metodoPago) {
            case 1 -> opcionPago = "efectivo";
            case 2 -> opcionPago = "tarjeta";
            default -> {
                System.out.println("Método no disponible");
                metodoPago = scanner.nextInt();
            }
        }

        {
            galon = montoCombustible / precio;

        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("---------GRIFOS TATA---------");
        System.out.println("Placa-Vehiculo : " + placa.toUpperCase());
        System.out.println("Nombre de Cliente : " + nombre.toUpperCase());
        System.out.println("Fecha y Hora de Proceso : " + formatter.format(date));
        System.out.println("Tipo de Combustible : " + tipo);
        System.out.println("Precio por Galón : S/ " + precio + " soles");
        System.out.println("Cantidad : " + String.format("%.2f", galon)+ " galones");
        System.out.println("Precio Total : " + montoCombustible + " soles");
        System.out.println("Saldo Restante en Tarjeta: S/ " + saldoTarjeta + " soles");
        System.out.println("---Vuelva pronto Grifos TATA---");
    }
}