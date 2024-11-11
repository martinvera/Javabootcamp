package com.segunda.tarea.ejercicio2;

//2018580 Cinthia Rojas
public class EstacionesDelAnio {

/*Elaborar un programa en java que permita mostrar las estaciones del año
(Primavera , Verano, Otoño, Invierno) por rangos de mes, mostrar en pantalla. */
       public int mes;
       public String estacion;

        public EstacionesDelAnio ( int mes) {
            this.mes = mes;

        }

        //Metodo Estaciones por Mes
        public void EstacionesPorMes () {
                if (mes >= 3 && mes <= 5) {
                    estacion = "Primavera en el rango: Marzo - Abril - Mayo";

                } else if (mes >= 6 && mes <= 8) {
                    estacion = "Verano en el rango: Junio - Julio - Agosto";

                } else if (mes >= 9 && mes <= 11 ) {
                    estacion = "Otoño en el rango: Septiembre - Octubre - Noviembre";

                } else if (mes == 12 || mes == 1 || mes == 2) {
                    estacion = "Invierno en el rango:Diciembre - Enero - Febrero";

                }else {
                    estacion = "Mes invalido";
                }
                System.out.println("La estacion del año es " + estacion);
            }



}
