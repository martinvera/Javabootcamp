public class CalcularInteres {
    public static void main(String[] args) {
        int numero = 35500;
        double interes = 0.255;
        double igv = 0.18;
        double resultadointeres=numero*interes;
        double resultadoigv = resultadointeres*igv;

        System.out.println("El interes calculado del prestamo de S/" + numero + " es S/" + resultadointeres);
        System.out.println("y el IGV del 18% del interés calculado es : S/" + resultadoigv);
    }
}
