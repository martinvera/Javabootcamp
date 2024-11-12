package Ejercicio1;

public class MostrarImpares {
    //

    //Metodo para imprimir numeros impares
    public void mostrarNumerosImpares(){
        System.out.println("\"Los numeros impares del mes son:\"");
        for(int i=0; i<30 ; i++){
            if(i % 2 != 0){

                System.out.println(i);
            }

        }
    }

}
