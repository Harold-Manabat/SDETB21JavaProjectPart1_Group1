package JavaProject_OOP_Part1;

public class OOP_Part1_7_WordCounter {
    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        // Replace non-word characters (like punctuation) with spaces and trim leading/trailing spaces
        str = str.replaceAll("[^a-zA-Z0-9]", " ").trim();

        // Split the cleaned string into words based on spaces
        if (str.isEmpty()) {
            return 0; // Handle cases where the string is empty or has no words
        }
        String[] words = str.split("\\s+");

        return words.length;
    }
}
