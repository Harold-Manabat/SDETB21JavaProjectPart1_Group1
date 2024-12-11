package JavaProject_OOP_Part1;

public class OOP_Part1_1_SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swap the strings
        str1 = str1 + str2; // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the original str1
        str1 = str1.substring(str2.length()); // Extract the original str2

        System.out.println("After Swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}