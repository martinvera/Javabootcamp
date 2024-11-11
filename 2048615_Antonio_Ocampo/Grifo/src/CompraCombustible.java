import java.util.Date;

public class CompraCombustible {
    void mostrarCombustible(String tipoCombustible[], double precioCombustible[]){
        for(int i =0; i < tipoCombustible.length; i++) {
                System.out.println(tipoCombustible[i] + " Precio: S/ " + precioCombustible[i]);
        }

    }
    public static double calcularGalonesCombustible (double precioUnitario, double totalPagarCombustible){
        double totalGalonesCombustible = totalPagarCombustible / precioUnitario;
        return totalGalonesCombustible;
    }
    void mostrarFormaPago(){
        System.out.println("(1) Efectivo");
        System.out.println("(2) Tarjeta");
    }

    public static String fechaActual (Date fecha){
        String dia;
        String mes;
        String anio;

        dia = Integer. toString(fecha.getDate());
        mes = Integer. toString(fecha.getMonth()+1);
        anio = Integer. toString(fecha.getYear());
        anio = anio.substring(1,3);
        String fechaActual = dia + "/" + mes + "/" + anio;
        return fechaActual;
    }

    public static String horaActual (Date horaDia){
        String hora;
        String minuto;
        String segundo;

        hora = Integer. toString(horaDia.getHours());
        minuto = Integer. toString(horaDia.getMinutes());
        segundo = Integer. toString(horaDia.getSeconds());

        String horaActual = hora + ":" + minuto + ":" + segundo;
        return horaActual;
    }
    void imprimirBoleta(String importeLetras, String placa, String nombresyApellidos, String fechaHora, double pUnitario, double cantidadGalones, double totalPagar ){
        System.out.println("El importe es: " + importeLetras);
        System.out.println("Placa del vehículo: " + placa);
        System.out.println("Nombres y Apellidos: " + nombresyApellidos);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Precio Unitario: " + pUnitario);
        System.out.println("Cantidad de Galones: " + cantidadGalones);
        System.out.println("Total a pagar: " + totalPagar);
    }

}
