package TAREA2;

public class RecorrerDias {
    public static void main(String[] args) {
        Mes mes = new Mes(30);// Crear un objeto Mes con 30 días
        mes.mostrarDiasImpares();
    }

    static class Mes {
        private int dias;

        // Constructor que recibe el número de días del mes
        public Mes(int dias) {
            this.dias = dias;
        }

        // Método para mostrar los días impares del mes
        public void mostrarDiasImpares() {
            System.out.println("Días impares del mes:");
            for (int dia = 1; dia <= dias; dia++) {
                if (esImpar(dia)) {
                    System.out.println("Día " + dia);
                }
            }
        }

        // Método auxiliar que verifica si un número es impar
        private boolean esImpar(int numero) {
            return numero % 2 != 0;
        }
    }
}
