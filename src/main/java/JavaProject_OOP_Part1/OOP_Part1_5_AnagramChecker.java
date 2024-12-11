package JavaProject_OOP_Part1;

import java.util.HashMap;
import java.util.Map;

public class OOP_Part1_5_AnagramChecker {
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean isAnagram = checkAnagram(str1, str2);

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println("Are Anagrams? " + isAnagram);
        }

        public static boolean checkAnagram(String str1, String str2) {
            // Remove all whitespace and convert strings to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // If lengths are different, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Use a HashMap to count character frequencies
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Count characters in the first string
            for (char c : str1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Subtract character counts using the second string
            for (char c : str2.toCharArray()) {
                if (!charCountMap.containsKey(c)) {
                    return false; // Character not found in the map
                }
                charCountMap.put(c, charCountMap.get(c) - 1);
                if (charCountMap.get(c) == 0) {
                    charCountMap.remove(c); // Remove character if count is zero
                }
            }

            // If the map is empty, the strings are anagrams
            return charCountMap.isEmpty();
        }
    }

