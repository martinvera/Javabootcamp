package calc;

import java.util.Scanner;

public class Calculator {

    //Sum method
    public static double sum(double a, double b) {
        return a + b;
    }

    //Method to subtract
    public static double subtract(double a, double b) {
        return a - b;
    }

    //Method to divide
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero no allowed.");
            return 0;
        } else {
            return a / b;
        }
    }

    //Method to calculate potency
    public static double potency(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double num1, num2, result;
        String continue_;

        do {
            // Calculator menu
            System.out.println("Select the operation:");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Divide");
            System.out.println("4. Potency");
            System.out.println("5. Exit");
            option = sc.nextInt();

            //Execute the selected operation
            if (option >= 1 && option <= 4) {
                System.out.print("Enter  the first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter  the second number: ");
                num2 = sc.nextDouble();

                switch (option) {
                    case 1:
                        result = sum(num1, num2);
                        System.out.println("sum result: " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Subtraction result: " + result);
                        break;
                    case 3:
                        result = divide(num1, num2);
                        if (num2 != 0) {
                            System.out.println("Division result: " + result);
                        }
                        break;
                    case 4:
                        result = potency(num1, num2);
                        System.out.println("Potency result: " + result);
                        break;
                }
                // Ask if you want to continue using the calculator
                System.out.print("¿continue using: (yes/not): ");
                continue_ = sc.next().toLowerCase(); // Convert to lowercase to avoid errors

                if (!continue_.equals("yes")) {
                    System.out.println("¡Thanks for using the calculator!");
                    break; // Exit the loop if you do not want to continue
                }
            } else if (option != 5) {
                System.out.println("Invalid option, try again.");
            }

        } while (option != 5);
        sc.close();
    }
}
