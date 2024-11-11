public class E1DiasImpares {

    public static void main(String[] args) {
        Mes mes = new Mes();
        mes.mostrarDiasImpares();
    }
}

class Mes {
    // Método mostrar días impares del mes, se considera que es mes de 30 dias
    public void mostrarDiasImpares() {
        for (int dia = 1; dia <= 30; dia++) {
            if (esImpar(dia)) {
                System.out.println("Día impar: " + dia);
            }
        }
    }

    // Método verificar si un día es impar
    private boolean esImpar(int numero) {
        return numero % 2 != 0;
    }
}

