import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr = "forgeeksskeegfor";
        System.out.println(isSentencePalindrome(arr));
    }

    public static String isSentencePalindrome(String s1) {
        boolean isPalindrome=true;
        int largest=0;
        int start=0;
        int end =0;

        int len= s1.length()-1;
        for(int i=0;i<=len;i++){
            if(s1.charAt(i)!=s1.charAt(len)){
                len--;
                continue;
            }
            int k=i;
            int m=len;
            while(s1.charAt(i)==s1.charAt(len)){
                i++;
                len--;
            }
            if(m-k>largest){
                largest=m-k;
               start=k;
               end=m;
            }

        }
        return s1.substring(start,end+1);
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



