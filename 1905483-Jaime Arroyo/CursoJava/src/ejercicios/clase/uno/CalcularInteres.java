package ejercicios.clase.uno;

public class CalcularInteres {
    public static void main(String[] args) {
        int prestamo = 35500;
        double tasainteres = 25.5, tasaigv = 18, intereses = 0, igv = 0;

        intereses = prestamo * (tasainteres / 100);
              igv = intereses * (tasaigv / 100);

        System.out.println("El Interes es: " + intereses);
        System.out.println("El IGV de Interes es: " + igv);
    }
}
