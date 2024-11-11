package printday;

import java.util.Scanner;

public class printDay {

    // Method to calculate the day of the week
    public static String calculateDayWeek(int day, int month, int year) {
        //Set the month and year if the month is January or February
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        // Variables for Zeller's algorithm
        int x = year % 100; //Last two digits of the year
        int y = year / 100; //First two digits of the year

        // Zeller's formula
        int z = (day + (13 * (month + 1)) / 5 + x + x / 4 + y / 4 + 5 * y) % 7;

        // Switch
        String dayOfWeek = switch (z) {
            case 0 -> "is Saturday";
            case 1 -> "is Sunday";
            case 2 -> "is Monday";
            case 3 -> "is Tuesday";
            case 4 -> "is Wednesday";
            case 5 -> "is Thursday";
            case 6 -> "is Friday";
            default -> "Calculation error";
        };

        return dayOfWeek;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter Date
        System.out.print("Enter day (dd): ");
        int day = sc.nextInt();

        System.out.print("Enter month (mm): ");
        int month = sc.nextInt();

        System.out.print("Enter year (yyyy): ");
        int year = sc.nextInt();

        // Call the method to calculate the day of the week
        String dayOfWeek = calculateDayWeek(day, month, year);

        // Show result
        System.out.println(dayOfWeek);

        sc.close();
    }
}
