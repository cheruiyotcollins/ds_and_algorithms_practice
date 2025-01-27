import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println(findAnagram(arr));
    }

    public static List<List<String>> findAnagram(String[] s1) {
        // Map to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : s1) {
            // Sort the characters of the word to create a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Group words with the same sorted characters
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        // Return the groups of anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
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
//}



