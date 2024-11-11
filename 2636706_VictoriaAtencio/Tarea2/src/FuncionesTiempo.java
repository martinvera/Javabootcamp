import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class FuncionesTiempo {

    public int diasDelMes(int ano, int mes ){
        // Crear un LocalDate con el primer día del mes y año especificado
        LocalDate fecha = LocalDate.of(ano, mes, 1);

        //obtengo el año y el mes
        YearMonth yearMonth = YearMonth.from(fecha);

        // obtengo la cantidad de dias
        int diasEnMes = yearMonth.lengthOfMonth();
        return diasEnMes;
    }

    public  String estacionesAno(int mes){
        Scanner scanner = new Scanner(System.in);

        String estacionAno =  switch(mes) {
            case 1,2,3 -> "Verano";
            case 4,5,6 -> "Otoño";
            case 7,8,9 -> "Invierno";
            case 10,11,12 -> "Primavera";
            default -> "Dato Ilegal";
        };

        return  estacionAno;
    }



}
