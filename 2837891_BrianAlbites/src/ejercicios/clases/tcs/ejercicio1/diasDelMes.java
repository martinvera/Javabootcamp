package ejercicios.clases.tcs.ejercicio1;

public class diasDelMes {
    public void listarDiasImpares(int mes){
        switch (mes){
            case 1,3,5,7,8,10,12 -> {
                for (int i = 1; i <= 31; i++){
                    if (i % 2 == 1){
                        System.out.println("Dia del mes: " + i);
                    }
                }
            }
            case 4,6,9,11 -> {
                for (int i = 1; i <= 30; i++){
                    if (i % 2 == 1){
                        System.out.println("Dia del mes: " + i);
                    }
                }
            }
            case 2 -> {
                for (int i = 1; i <= 29; i++){
                    if (i % 2 == 1){
                        System.out.println("Dia del mes: " + i);
                    }
                }
            }
            default -> System.out.println("Escogió una opción incorrecta");
        }
    }
}
