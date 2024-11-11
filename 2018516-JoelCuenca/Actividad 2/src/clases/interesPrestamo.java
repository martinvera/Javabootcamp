package clases;

public class interesPrestamo {
    /* 5. Elaborar un programa en java que permita calcular el interés del 25.5 % de un
       préstamo de 35,500 y calcular el igv del 18% del interés calculado.
    */

    double prestamo = 35.500;
    double interes = 25.5 / 100 ;
    double igv = (18 * 1.0) / 100;

    double resultado;

    double interesCalculado(){
        resultado = prestamo * interes;

        return resultado;
    }

    double igvCalculado(){

        resultado = interesCalculado() * igv;

        return  resultado;
    }
}
