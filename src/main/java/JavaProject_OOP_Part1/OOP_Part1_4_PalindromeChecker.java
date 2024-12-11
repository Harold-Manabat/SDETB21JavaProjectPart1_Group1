package JavaProject_OOP_Part1;

public class OOP_Part1_4_PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = checkPalindrome(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from the beginning and the end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }
}
