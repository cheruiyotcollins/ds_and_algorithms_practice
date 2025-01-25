import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(longestSubstring(str));
    }

    public static String longestSubstring(String str) {
        int start=0;
        int stop=0;
        int max=0;
        int len=str.length();
        for (int i=0; i<len;i++) {
           int k=i;
            Set<Character> uniqueCharacters=new HashSet<>();
           while(k<len){

               if(uniqueCharacters.contains(str.charAt(k))){
                   if(k-i>max){
                       max=k-i;
                       start=k;
                       stop=i;
                   }
               }
               uniqueCharacters.add(str.charAt(k));
               k++;
           }
        }


        return str.substring(start,stop);
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



