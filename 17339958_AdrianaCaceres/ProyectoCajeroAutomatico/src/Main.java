import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
        Scanner scanner;
        boolean continuar = true;
        do {
            scanner = new Scanner(System.in);

            cajeroAutomatico.solicitarDatosRetiro();
            cajeroAutomatico.retirarDinero();

            System.out.println();
            System.out.print("Desea realizar otro retiro? (1=Si, 0=No): ");
            continuar = scanner.nextInt() == 1;

            System.out.println();
        } while (continuar);

        scanner.close();
    }
}