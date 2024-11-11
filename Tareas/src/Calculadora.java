import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Double Resultado = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        Double num1 = scanner.nextDouble();
        System.out.println("ingrese el segundo número: ");
        Double num2 = scanner.nextDouble();
        System.out.println("ingrese la operación a realizar: ");
        String operacion = scanner.next();
        switch (operacion) {
            case "+":
                Resultado = num1 + num2;
                break;
            case "-":
                Resultado = num1 - num2;
                break;
            case "*":
                Resultado = num1 * num2;
                break;
            case "/":
                Resultado = num1 / num2;
                break;
            case "P":
                Resultado = Math.pow(num1,num2);
                break;
            default:
                System.out.println("Operación no valida!");
                break;
        }
        System.out.println("El resultado de la operación es " + Resultado);
    }
}
