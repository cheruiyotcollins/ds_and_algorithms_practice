import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr = "Too hot to hoot.";
        System.out.println(isSentencePalindrome(arr));
    }

    public static String isSentencePalindrome(String s1) {
        boolean isPalindrome=true;
        String s1Arr= s1.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);

        int len= s1Arr.length()-1;
        for(int i=0;i<=len;i++){
            if(s1Arr.charAt(i)!=s1Arr.charAt(len)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome? "Is Palindrome": "Not Palindrome";
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



