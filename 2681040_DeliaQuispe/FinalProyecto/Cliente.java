package FinalProyecto;

import java.util.Scanner;

public class Cliente {
    public String nombre;
    public String apellido;
// declaramos un metod publico para pedir el nomnbre y a apellido del clienbte
    public void  PedirNombreCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de cliente: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido del cliente: ");
        apellido = scanner.nextLine();
    }
// declaramo un mnetodo para mostrar nombre del cliente
    public void MostrarNombreCliente(){
        System.out.println("Nombre :" + nombre.toUpperCase());
        System.out.println("Apellido :" + apellido.toUpperCase());
    }




}

