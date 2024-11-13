import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CajeroAutomatico rt = new CajeroAutomatico();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while (opcion != 3) {
            System.out.println("\n\t\tCAJERO AUTOMATICO");
            System.out.println("\t\t------ ----------\n");
            System.out.println("[1] Retirar dinero");
            System.out.println("[2] Consultar Saldo");
            System.out.println("[3] SALIR");
            System.out.print("Elija opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    rt.retirarDinero();
                    break;
                case 2:
                    rt.consultarSaldo();
                    break;
                case 3:
                    System.out.println("\n\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("\nOpción equivocada");
            }
        }
    }
}