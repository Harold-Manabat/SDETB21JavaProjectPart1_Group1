package JavaProject_OOP_Part1;

public class OOP_Part1_10_RemoveDuplicates {
    public static void main(String[] args) {
        // Sample array of strings with duplicates
        String[] arr = {"apple", "banana", "apple", "orange", "banana"};

        // Remove duplicates
        String[] uniqueArr = removeDuplicates(arr);

        // Display the result
        System.out.print("Array after removing duplicates: ");
        for (String item : uniqueArr) {
            System.out.print(item + " ");
        }
    }

    // Method to remove duplicates
    public static String[] removeDuplicates(String[] arr) {
        // We will use a StringBuilder to build the unique array
        StringBuilder uniqueItems = new StringBuilder();

        // Loop through each element of the array
        for (String item : arr) {
            // If the item is not already in the uniqueItems StringBuilder, add it
            if (uniqueItems.indexOf(item) == -1) {  // indexOf returns -1 if item doesn't exist
                uniqueItems.append(item).append(" ");
            }
        }

        // Convert StringBuilder to an array
        String[] result = uniqueItems.toString().split(" ");
        return result;
    }
}
