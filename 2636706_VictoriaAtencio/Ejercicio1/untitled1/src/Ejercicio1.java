import java.time.LocalDate;
import java.time.YearMonth;

public class Ejercicio1 {
    public static void main(String[] args) {
        //obtengo la fecha actual
        LocalDate fechaActual = LocalDate.now();

        //obtengo el año y el mes
        YearMonth yearMonth = YearMonth.from(fechaActual);

        // obtengo la cantidad de dias
        int diasEnMes = yearMonth.lengthOfMonth();

        //System.out.println("dias es"+ diasEnMes);

        // en if es mas rapido que la condición sea verdadera.

        for (int i=1;i<=diasEnMes;i++){
            //Un número es impar si el resto de su división por 2 es diferente de cero
            if (i%2 !=0){
                System.out.println( i);
            }
        }

    }
}


