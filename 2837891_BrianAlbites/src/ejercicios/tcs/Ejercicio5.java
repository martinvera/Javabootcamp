package ejercicios.tcs;

public class Ejercicio5 {
    public static void main(String[] args) {
        var interes = 0.255;
        var prestamo = 35000.00;
        var igv = 0.18;

        System.out.println("El prestamo es: " + prestamo);
        System.out.println("El interés del prestamo es: " + prestamo * interes);
        System.out.println("El IGV sobre el interés es: " + (prestamo * interes) * igv);
    }
}
