package converttext;

import java.util.Scanner;

public class ConvertText {

    // Method to convert text to uppercase
    public static String convertUppercase(String text) {
        return text.toUpperCase();
    }

    // Method to extract vowels
    public static String extractVowels(String text) {
        StringBuilder vowel = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (isVowel(character)) {
                vowel.append(character);
            }
        }
        return vowel.toString();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // Convert to lowercase to simplify comparison
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a word or string
        System.out.print("Enter a word or text string: ");
        String text = sc.nextLine();

        // Convert string to uppercase
        String textUppercase = convertUppercase(text);
        System.out.println("Text in uppercase: " + textUppercase);

        //Extract vowels from original string
        String extractedVowels = extractVowels(text);
        System.out.println("Found vowels: " + extractedVowels);

        sc.close();
    }
}
