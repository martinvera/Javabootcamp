package cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresar su numero de cuenta de 16 digitos:");
        String NroTarjeta = sc.nextLine();

        if (NroTarjeta.matches("\\d{16}")){
            System.out.println("Por favor ingrese su Nombre y Apellido");
            String nombre = sc.nextLine();
            if(nombre != ""){
                System.out.println("Bienvenido: " +nombre);

                CajeroAutomatico caj = new CajeroAutomatico();
                System.out.println("Ingrese el tipo de Cuenca a Consultar: 1 = SOLES & 2 = DOLARES");
                int moneda = sc.nextInt();
                    caj.RetirarMonto(moneda);
            }else {
                System.out.println("Por favor vuelve a intentarlo ingresando correctamente sus datos");
            }
        } else {
            System.out.println("Por favor verificar que la cuenta ingresada solo valores numericos y de 16 digitos");
        }

    }
}
