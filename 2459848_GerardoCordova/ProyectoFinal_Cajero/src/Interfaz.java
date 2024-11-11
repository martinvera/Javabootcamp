import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digitar su número de tarjeta ");
       double identificador2 = scanner.nextDouble();

        IdentificadorTarjeta identificador3 = new IdentificadorTarjeta();
        identificador3.identifica(identificador2);

        if(identificador3.digitos == 16) {

            String identificador = scanner.nextLine();

        System.out.println("Por favor ingrese su nombre");
        String contraseña = scanner.nextLine();
            System.out.println("Por favor ingrese su apellido");
            String contraseña2 = scanner.nextLine();

       CajeroAutomatico cajero = new CajeroAutomatico(contraseña,contraseña2);

        int opcionSeleccionada;

       do {
            System.out.println(">>>Elija una de las siguientes opciones:>>>");
            System.out.println("Escriba 1 para consultar su saldo");
            System.out.println("Escriba 2 para sacar dinero");

            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada){

                case 1:
                    cajero.mostrarSaldo();
                    break;

                case 2:
                    cajero.sacarDinero();
                    break;

                default:
                    cajero.salir();
            }

        } while (opcionSeleccionada==1 || opcionSeleccionada ==2);

       }
        else{
            System.out.println("Número de tarjeta invalido");}
    }

}
