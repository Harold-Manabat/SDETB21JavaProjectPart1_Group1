package JavaProject_OOP_Part1;

public class OOP_Part1_9_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abracadabra";

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Print the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a frequency array to store the count of each character
        int[] charCount = new int[256]; // ASCII character set

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Iterate over the string to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);  // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a special character (null character)
        return '\0';
    }
}