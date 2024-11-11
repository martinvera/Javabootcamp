package FinalProyecto;

import java.util.Scanner;

public class ValidarNumeroDeTarjeta {
    String numeroTarjeta;
    public  void ValidarNumeroTarjeta(){
        Scanner scanner= new Scanner(System.in);
    // validar el numero de tarjeta sea de 16 digitos
        while (true) {
            System.out.print("Ingrese su número de tarjeta (16 dígitos): ");
            numeroTarjeta = scanner.nextLine();
            if (numeroTarjeta.matches("\\d{16}")) {
                break;
            } else {
                System.out.println("Número de tarjeta inválido. Debe tener 16 dígitos numéricos.");
            }
        }
    }
}
