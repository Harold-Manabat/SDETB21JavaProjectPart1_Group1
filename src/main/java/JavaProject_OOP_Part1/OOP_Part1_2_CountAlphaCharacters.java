package JavaProject_OOP_Part1;

public class OOP_Part1_2_CountAlphaCharacters {
        public static void main(String[] args) {
            String input = "Hello, World! 1234.";
            int alphaCount = 0;

            // Loop through each character in the string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Check if the character is a letter
                if (Character.isLetter(ch)) {
                    alphaCount++;
                }
            }

            System.out.println("The number of alphabetic characters is: " + alphaCount);
        }
    }
