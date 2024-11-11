import java.util.Scanner;
public class Tarea_Estaciones {

    public static void main(String[] args) {
        int mes, dia;
        Scanner rifa = new Scanner(System.in);
        System.out.println("Escribe el dia ");
        dia = rifa.nextInt();
        System.out.println("Escribe el mes ");
        mes = rifa.nextInt();
        if ((mes<12&&mes>0)||(dia<32&&dia>0))
        {
        if ((mes==3&&dia>20)||(mes==4&&dia>0)||(mes==5&&dia>0)||(mes==6&&dia<21))
            System.out.println("Es Otoño");
        if ((mes==6&&dia>20)||(mes==7&&dia>0)||(mes==8&&dia>0)||(mes==9&&dia<21))
            System.out.println("Es Invierno");
        if ((mes==9&&dia>20)||(mes==10&&dia>0)||(mes==11&&dia>0)||(mes==12&&dia<21))
            System.out.println("Es Primavera");
        if ((mes==12&&dia>20)||(mes==1&&dia>0)||(mes==2&&dia>0)||(mes==3&&dia<21))
            System.out.println("Es Verano");
        }
    }
}
