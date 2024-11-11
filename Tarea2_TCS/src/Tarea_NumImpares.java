import java.util.Scanner;

public class Tarea_NumImpares {
    public static void  main(String[] args){
        Scanner leer = new Scanner(System.in);

        int dias = 0;
        System.out.println("Ingresa el numero de dias: ");
        dias = leer.nextInt();

        for(int i=1;i<dias;i++){
            if(i % 2==1){
                System.out.println("el numero "+i+" es impar");
            }
        }

    }

}
