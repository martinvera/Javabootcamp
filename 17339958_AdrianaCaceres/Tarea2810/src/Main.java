import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {

        public static void main(String[] args) {

        GregorianCalendar hoy = new GregorianCalendar();
        String fechaActual;
        int dia, mes, año;

        dia = hoy.get(Calendar.DAY_OF_MONTH);
        mes = hoy.get(Calendar.MONTH) + 1;
        año = hoy.get(Calendar.YEAR);
        fechaActual = dia + "-" + mes + "-" + año;
        System.out.println("Fecha: " + fechaActual);


        int[] nums = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 30};
        for (int i = 0; i != nums.length; ++i) {
                      if (nums[i] % 2 != 0) {
                System.out.println("Dias impares:" + nums[i]);
            }


        }
    }
}