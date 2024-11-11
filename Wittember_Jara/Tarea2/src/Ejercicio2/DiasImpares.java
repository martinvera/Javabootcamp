package Ejercicio2;

public class DiasImpares {
    public static void main(String[] args) {

        DiasImpares diasImpares = new DiasImpares();
        diasImpares.mostrarDiasImpares();
    }

    public void mostrarDiasImpares() {
        for (int dia = 1; dia <= 30; dia++) {
            if (calculoIm(dia)) {
                System.out.println("El día impar es : " + dia);
            }
        }
    }

    public boolean calculoIm(int numero) {
        return numero % 2 != 0;
    }

}
