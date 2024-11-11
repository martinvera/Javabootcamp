

public class Tarea_DiasImpare {
    public static void  main(String[] args) {

        for (int día =0; día<=30; día++ ){
            if(día % 2 != 0){
                System.out.println("Días impares del mes: " +día);
            }
        }
    }
}
