import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(longestSubstring(str));
    }


    public static String longestSubstring(String str) {
        int start = 0; // Start of the current window
        int maxStart = 0; // Start index of the longest substring
        int maxLength = 0; // Length of the longest substring
        Set<Character> uniqueCharacters = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            // If the character is already in the set, shrink the window from the start
            while (uniqueCharacters.contains(currentChar)) {
                uniqueCharacters.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            uniqueCharacters.add(currentChar);

            // Update maxLength and maxStart if the current window is the largest so far
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        // Return the longest substring
        return str.substring(maxStart, maxStart + maxLength);
    }

//    public static List<List<Integer>> stringIntegerConverter(List<String> history){
//        List<List<Integer>> integerList= new ArrayList<>();
//        for(String s: history){
//            String[] parts =s.split(",");
//            List<Integer> integers = new ArrayList<>();
//            for(String part:parts){
//                integers.add(Integer.parseInt(part));
//
//            }
//            integerList.add(integers);
//        }
//        return integerList;
//    }
}



