import java.util.Scanner;

public class E3Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("¡Bienvenido a la Calculadora!");
        System.out.print("Ingresa el 1er número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el 2do número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elige la operación:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Elevar a la potencia");
        System.out.print("Opción seleccionada es: ");

        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = calc.sumar(num1, num2);
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = calc.restar(num1, num2);
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 4:
                resultado = calc.potencia(num1, num2);
                System.out.println("Resultado de la potencia: " + resultado);
                break;
            default:
                System.out.println("Opción inválida, intenta de nuevo.");
                break;
        }

        scanner.close();
    }
}

class Calculadora {

    // Método sumar
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método restar
    public double restar(double a, double b) {
        return a - b;
    }

    // Método dividir
    public double dividir(double a, double b) {
        return a / b;
    }

    // Método calcular la potencia
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
