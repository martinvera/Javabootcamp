import java.util.Scanner;
public class TareaCajero_Final {
    //Variables/objetos de ámbito global, visibles para todos los métodos
    private static Cuenta[] cuentas;
    private static Scanner teclado = new Scanner(System.in);

    //Programa principal
    public static void main (String[] args) {
        inicializarCuentas();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        String numeroTarjeta = "";


        while (opcion != 4) {
            System.out.println("CAJERO AUTOMATICO ATM DEL BCP");
            System.out.println("  BIENVENIDOS\n");
            Scanner leer = new Scanner(System.in);
            numeroTarjeta = solicitaTarjeta(scanner);
            // Paso 2: Pedir nombre y apellido
            System.out.print("Ingrese su nombre y apellido: ");
            String nombre = scanner.nextLine();
            System.out.println("\n\t\tCCAJERO AUTOMATICO ATM DEL BCP");
            System.out.println("\t\t------ ----------\n");
            System.out.println("[1] Retirar saldo");
            System.out.println("[2] Depositar saldo");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] SALIR");
            System.out.print("Elija opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion) {
                case 1:
                    retirar();
                    break;
                case 2:
                    ingresar();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    System.out.println("\n\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("\nOpción equivocada");
            }
        }
    }
    private static String solicitaTarjeta(Scanner scanner) {
        String nrotarjeta = "";
        boolean entradaValida = false;
        while (entradaValida == false) {
            System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
            nrotarjeta = scanner.nextLine();
            if (nrotarjeta.matches("\\d{16}")) {// Verifica si el string es de 16 dígitos y numérico
                entradaValida = true;
            }
            else {
                System.out.println("Error: Entrada no válida. Debe ingresar 16 dígitos numéricos.");
            }
        }
        // Formatear el número de tarjeta
        nrotarjeta = nrotarjeta.replaceAll("(\\d{4})(?=\\d)", "$1-");
        return nrotarjeta;
    }
    //Métodos para realizar distinas operaciones

    /**
     * Inicializa el array de objetos Cuenta con unos datos predefinidos
     * para poder trabajar con distintas cuentas.
     */
    private static void inicializarCuentas() {
        cuentas = new Cuenta[1];
        cuentas[0] = new Cuenta("Raúl Ramirez", "1234", 5500.88);

    }

    /**
     * Pide un PIN al usuario y busca el objeto Cuenta asociado a él.
     * Si lo encuentra, retorna el objeto Cuenta asociado.
     * Si no lo encuentra, retorna valor null
     */
    private static Cuenta buscarPorPIN() {
        System.out.println("\nIntroduzca su PIN de 4 digitos");
        String PIN = teclado.nextLine();

        //Buscamos la cuenta con el PIN indicado
        for (int i = 0; i < cuentas.length; i++)
            if (cuentas[i].getPIN().equals(PIN))
                return cuentas[i]; //Si la encontramos, la retornamos

        //Si el bucle FOR no ha retornado nada, es que el PIN es incorrecto y retornamos null
        return null;
    }

    /**
     * Permite retirar saldo de una Cuenta, previamente identificada
     * mediante PIN de acceso
     */
    private static void retirar() {

        Cuenta usuario = buscarPorPIN();

        if (usuario == null)
            System.out.println("\nNo existe Cuenta asociada a ese PIN");
        else {
            System.out.print("\nCantidad a retirar: ");
            double cantidad = Double.parseDouble(teclado.nextLine());
            usuario.retirar(cantidad);
        }
    }

    /**
     * Permite ingresar saldo en una Cuenta, previamente identificada
     * mediante PIN de acceso
     */
    private static void ingresar() {

        Cuenta usuario = buscarPorPIN();

        if (usuario == null)
            System.out.println("\nNo existe Cuenta asociada a ese PIN");
        else {
            System.out.print("\nCantidad a ingresar: ");
            double cantidad = Double.parseDouble(teclado.nextLine());
            usuario.ingresar(cantidad);
        }
    }

    /**
     * Permite consultar saldo de una Cuenta, previamente identificada
     * mediante PIN de acceso
     */
    private static void consultarSaldo() {

        Cuenta usuario = buscarPorPIN();

        if (usuario == null)
            System.out.println("\nNo existe Cuenta asociada a ese PIN");
        else
            System.out.println("\nSaldo actual: " + usuario.getSaldo());
    }

}
