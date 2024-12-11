package JavaProject_OOP_Part1;

public class OOP_Part1_6_VowelCounter {
    public static void main(String[] args) {
        String input = "documentation";
        int vowelCount = countVowels(input);

        System.out.println("String: " + input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        int count = 0;
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
