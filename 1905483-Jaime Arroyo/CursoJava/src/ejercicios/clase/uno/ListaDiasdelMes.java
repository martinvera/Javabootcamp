package ejercicios.clase.uno;

public class ListaDiasdelMes {
    public static void main(String[] args) {
        //Definición de Variable
        int nmes = 4;
        int ndias, i;

        if (nmes == 1 || nmes == 3 || nmes == 5 || nmes == 7 ||
            nmes == 8 || nmes == 10 || nmes == 12) {
            ndias = 31;
        } else if (nmes == 4 || nmes == 6 || nmes == 9 || nmes == 11) {
            ndias = 30;
        } else {
            ndias = 28;
        }
        for (i = 2; i <= ndias; i++) {
            if (i % 2 != 0) {
                System.out.println("dia: " + i);
            }
        }
    }
}
