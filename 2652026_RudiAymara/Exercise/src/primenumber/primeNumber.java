package primenumber;

import java.util.Scanner;

public class primeNumber {

    //Method to check if a number is prime
    public static boolean isPrime(int number) {
        //A number less than or equal to 1 is not prime
        if (number <= 1) {
            return false;
        }

        // Check if the number has divisors besides 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; //If it has a divisor, it is not prime
            }
        }

        return true; //If it has no divisors, it is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method to check if it is prime
        if (isPrime(number)) {
            System.out.println("the number " + number + " is prime.");
        } else {
            System.out.println("The number " + number + " it is not prime.");
        }

        sc.close();
    }
}
