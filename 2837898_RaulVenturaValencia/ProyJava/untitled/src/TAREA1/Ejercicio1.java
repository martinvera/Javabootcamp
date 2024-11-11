package TAREA1;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Dias impares del mes: ");
        // Verifica si el día es impar (dia % 2 diferente de 0)
        for (int dia = 1; dia <= 30; dia++){
            if (dia % 2 != 0){
                System.out.println("Dia: " + dia);
            }
        }
    }
}
