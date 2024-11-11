//4. Elaborar un programa en java que permita convertir un palabra o cadena de texto en minúsculas
// a mayúsculas y que extraiga las vocales que se identifique dentro de la palabra o cadena de texto y mostrarlo en pantalla.
import java.util.Scanner;

public class Tarea_Interes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double interes, IGV, prestamo, porcentaje_de_interes, monto_calculado, porcentaje_de_IGV;
        System.out.print("Ingresa el valor del importe del prestamo: ");
        prestamo = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de porcentaje de INTERES: ");
        porcentaje_de_interes = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de porcentaje de IGV: ");
        porcentaje_de_IGV = in.nextDouble();
        in.nextLine();

        interes=prestamo*porcentaje_de_interes/100;
        IGV=prestamo*porcentaje_de_IGV/100;
        monto_calculado=prestamo+interes+IGV;

        System.out.println("Valor de IGV: " + IGV);
        System.out.println("Valor de interes: " + interes);
        System.out.println("Valor de monto calculado: " + monto_calculado);
    }
}
