
public class Ejercicio2 {
    public static void main(String[] args) {
        //Elaborar un programa en java que permita mostrar las estaciones del año (Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla.
        FuncionesTiempo funcionesTiempo = new FuncionesTiempo();

        //Enviamos un mes, el sistema imprimira el número de mes y la estación del año.
        Mes mes = Mes.FEBRERO;

        System.out.println("El número del mes " + mes + " es: " + mes.getNumero());

        int numeroMes = mes.getNumero();

        String estacionAno = funcionesTiempo.estacionesAno(numeroMes);
        System.out.println("La estación del año del mes de " + mes + " es: " + estacionAno);

    }
}
