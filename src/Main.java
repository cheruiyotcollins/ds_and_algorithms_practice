import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr = "())((())";
        System.out.println(isBalanced(arr));
    }

    public static String isBalanced(String s1) {
        int balance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '(') {
                balance++;
            } else if (s1.charAt(i) == ')') {
                balance--;
            }
            // If at any point, balance goes negative, it's not balanced
            if (balance < 0) {
                return "Not Balanced";
            }
        }
        // If balance is zero, parentheses are balanced
        return balance == 0 ? "Balanced" : "Not Balanced";
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



