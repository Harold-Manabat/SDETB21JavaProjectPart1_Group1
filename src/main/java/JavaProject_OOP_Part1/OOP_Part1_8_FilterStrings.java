package JavaProject_OOP_Part1;

public class OOP_Part1_8_FilterStrings {
    public static void main(String[] args) {
    // Input array of strings
    String[] strings = {"Apple", "Banana", "Apricot", "Mango", "Avocado", "Berry"};

    // Call the method to filter and process strings
    String[] result = filterAndConvert(strings);

    // Print the result
    System.out.println("Filtered and converted strings:");
    for (String str : result) {
        if (str != null) {  // to skip null values
            System.out.println(str);
        }
    }
}

    public static String[] filterAndConvert(String[] strings) {
        // Count how many valid strings start with 'A' to initialize the result array
        int count = 0;
        for (String str : strings) {
            if (str.toUpperCase().startsWith("A")) {
                count++;
            }
        }

        // Create a result array with the exact size needed
        String[] filteredArray = new String[count];
        int index = 0;

        // Populate the result array with filtered and lowercase strings
        for (String str : strings) {
            if (str.toUpperCase().startsWith("A")) {
                filteredArray[index++] = str.toLowerCase();
            }
        }

        return filteredArray;
    }
}