package JavaProject_OOP_Part1;

public class OOP_Part1_3_ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}