package Clases;

import java.util.Scanner;

public class CalcularIntereses {
    public static void main(String[] args) {

//inteses 25.5%
        // prestamo 25.500
        //calcular igv 18% del intreres calculado
        float capital, interesanual, totalDeIntereses, totaligv;
        double igv = 0.18;
        int ano;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el capital del prestamo");
        capital = scanner.nextFloat();
        System.out.println("Ingrese por favor el interes anual:  ");
        interesanual = scanner.nextFloat();
        System.out.println("Introduce los años prestamos :");
        ano = scanner.nextInt();
        totalDeIntereses = capital * interesanual / 100 * ano;
        System.out.println(" Capital a invertir: " + capital + " \n Intereses anual: " + interesanual + " \n Años :" + ano + " \nTotal de inteses: " + totalDeIntereses);
        totaligv = (float) (totalDeIntereses * igv);
        System.out.println(" El total de IGV: " + totaligv);
    }
}
