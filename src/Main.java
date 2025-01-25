import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "geeekk";
        System.out.println(longestSubstring(str));
    }


    public static char longestSubstring(String str) {
        char mostOccuring = 0;
        int maxLength = 0;
        int len= str.length();
        for (int i= 0; i< str.length(); i++) {
        char currentChar = str.charAt(i);
        int current=i;

            while (current<len&&str.charAt(current)==currentChar) {
                current++;
            }

            if (current - i > maxLength) {
                maxLength = current-i;
                mostOccuring = currentChar;
            }
        }

        System.out.println(maxLength);
        return mostOccuring;
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



