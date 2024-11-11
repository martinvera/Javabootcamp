package clases;

public class calcularMate {
    /*3. Elaborar un programa en java que simule una calculadora para sumar, restar,
    dividir y calcular la potencias.*/

    int resultado;

    public int CalcularSuma(int valor1, int valor2){

        resultado = valor1 + valor2;

        return resultado;
    }

    protected  int CalcularResta(int valor1, int valor2){

        resultado = valor1 - valor2;

        return resultado;
    }

    double CalcularDivision(int valor1, int valor2){

        double division;

        division = (valor1 * 1.0) / valor2;

        return division;
    }

    double CalcularPotencia(int valor1, int valor2){

        double potencia;

        potencia = Math.pow(valor1,valor2);

        return potencia;
    }

}
