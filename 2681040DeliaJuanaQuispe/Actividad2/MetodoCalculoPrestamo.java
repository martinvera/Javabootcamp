package Actividad2;

import java.util.Scanner;

public class MetodoCalculoPrestamo {
    public  double montoPrestamo;
    public  double tasaInteres;
    public  double tasaIgv;
    public double Totaintereses;
    public double Totaligv;

    public void SolicitarPrestamo(){

        Scanner dato= new Scanner(System.in);
        System.out.println("Ingresar monto de prestamo: ");
        montoPrestamo=dato.nextDouble();
        System.out.println("Ingresar tasa de interes 25.5: ");
        tasaInteres=dato.nextDouble() /100;
        System.out.println("Ingresar tasa de IGV 18: ");
        tasaIgv=dato.nextDouble()/100;
    }

public void CalculInteres(){
     Totaintereses= montoPrestamo*tasaInteres;
}
public  void CalcularIGV(){
    Totaligv =  Totaintereses * tasaIgv;
}
public void ResultadoOperacion(){
    System.out.println("Monto del préstamo: S/. " + montoPrestamo);
    System.out.println("Tasa de interes : " + (tasaInteres*100) + "%");
    System.out.println("Interes Calculado : " + Totaintereses);
    //System.out.println("Tasa de IGV: S/. " +  tasaIgv);
    System.out.println("IGV del interés: S/. " + Totaligv);

}
}
