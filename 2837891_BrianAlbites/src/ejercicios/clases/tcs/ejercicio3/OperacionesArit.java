package ejercicios.clases.tcs.ejercicio3;

public class OperacionesArit {
    public void resultadoOperaciones(double num1, double num2){
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multi = num1 * num2;
        double divi = num1 / num2;

        if (num1 < num2){
            String resultado = "El resultado de la suma es: " + suma
                    + "\n" + "El resultado de la resta es: " + resta
                    + "\n" + "El resultado de la multiplicación es: " + multi
                    + "\n" + "El resultado de la división no se puede dar";
            System.out.println("\n" +"Para que se de la división, el primer número debe ser mayor al segundo: " + "\n"
                    + "\n" + resultado);

        }else {
            String resultado = "El resultado de la suma es: " + suma
                    + "\n" + "El resultado de la resta es: " + resta
                    + "\n" + "El resultado de la multiplicación es: " + multi
                    + "\n" + "El resultado de la división es: " + divi;
            System.out.println("\n" + "Las operaciones aritmeticas de los números dados son: " + "\n"
                    + "\n" + resultado);
        }
    }
}
