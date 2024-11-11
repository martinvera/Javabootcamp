public class Estaciones {
    public static void main(String[] args) {
        String estacionesAnio[] = {"Primavera" , "Verano", "Otoño", "Invierno"};
        String rango[] = {"setiembre - diciembre" , "diciembre - marzo", "marzo - junio", "junio - setiembre"};
        for(int i =0; i < estacionesAnio.length; i++){
            System.out.println(estacionesAnio[i] + " es de " + rango[i]);
        }
    }
}
