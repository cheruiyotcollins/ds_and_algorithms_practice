import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr = "())((())";
        System.out.println(isBalanced(arr));
    }

    public static String isBalanced(String s1) {
        int count1=0;
        int count2=0;
        int len= s1.length();
        for(int i=0;i<len;i++){
         if(s1.charAt(i)=='('){
             count1++;
         }else{
             count2++;
         }
        }
        if(count1==count2){
            return "Balanced ";
        }

        return "Not Balanced ";
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



