import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println(findAnagram(arr));
    }


    public static List<List<String>> findAnagram(String[] s1) {

        List<List<String>> anagrams= new ArrayList<>();
        int len= s1.length;
        for(int i = 0; i < len; i++) {
            List<String> anagram= new ArrayList<>();
            for(int j=i+1;j<len-1;j++) {
                boolean isAnagram=true;
                int strLen = s1[i].length();
                int m = strLen - 1;
                for (int k = 0; k < strLen; k++) {
                    if (s1[i].charAt(k) != s1[j].charAt(m)) {
                        isAnagram = false;
                        break;
                    }
                    m--;
                }
                if(isAnagram){
                    anagram.add(s1[i]);
                    anagram.add(s1[j]);
                }
            }
            anagrams.add(anagram);
        }


        return  anagrams;
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



