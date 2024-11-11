package Actividad2;
import java.util.Scanner;
public class MetodoDiasImpar {

    int totalDias;
    //declaramos un metodo para pedir 30 dias del mes
    public void pedirDias(){
        Scanner datos= new Scanner(System.in);
        System.out.println("Ingresar 30 dias : ");
        totalDias = datos.nextInt();
    }
    // declaramos un  metodo para capturar nunmero impares del mes
    public  void BuscarNumeroImpar(){
         for (int i = 1; i <= totalDias; i += 2) {//Notemos que escribir i+=2 es similar a escribir i = i + */
            System.out.println("Los días impares son :" + i);
        }
    }

}

