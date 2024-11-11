package ejercicios.clase.uno;

public class Calculadora {
    public static void main(String[] args) {
        //Variables
        int i, suma, resta, multiplicacion, potencia = 1;
        int num1 = 5;
        int num2 = 4;
        float division;

        suma  = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        for (i = 1; i <= num2; i++){
            potencia = potencia * num1;
        }
        System.out.println("La Suma es: " + suma);
        System.out.println("La Resta es: " + resta);
        System.out.println("La Multiplicación es: " + multiplicacion);
        System.out.println("La División es: " + division);
        System.out.println("La Potenciación es: " + potencia);
    }
}
