import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String str = "timetopractice";
        String inp="toc";

        System.out.println(containsAllCharacters(str,inp));
    }




    public static String containsAllCharacters(String S, String P) {
        // Frequency map for characters in P
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : P.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int required = freqMap.size(); // Number of unique characters in P
        int formed = 0; // Number of characters in the current window that match P's frequency

        Map<Character, Integer> windowCounts = new HashMap<>();
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        // Sliding window
        while (right < S.length()) {
            // Add the current character to the window
            char c = S.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // Check if the character matches the frequency in P
            if (freqMap.containsKey(c) && windowCounts.get(c).equals(freqMap.get(c))) {
                formed++;
            }

            // Try to shrink the window from the left
            while (formed == required) {
                // Update the smallest substring
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                // Remove the left character from the window
                char leftChar = S.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                // If removing this character breaks the condition, decrement formed
                if (freqMap.containsKey(leftChar) && windowCounts.get(leftChar) < freqMap.get(leftChar)) {
                    formed--;
                }

                left++; // Shrink the window
            }

            right++; // Expand the window
        }

        // Return the result
        return startIndex == -1 ? "-1" : S.substring(startIndex, startIndex + minLength);
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



