package season;

import java.util.Scanner;

public class YearSeason {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a month number
        System.out.println("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        // Determine the season based on the month entered
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "spring";
        } else if (month >= 3 && month <= 5) {
            season = "winter";
        } else if (month >= 6 && month <= 8) {
            season = "summer";
        } else if (month >= 9 && month <= 11) {
            season = "fall";
        } else {
            season = "Invalid month. Enter a number between 1 & 12.";
        }

        // show season
        System.out.println("The season is: " + season);
    }
}
