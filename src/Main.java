import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
//        listString.add("7,1,2");
//        listString.add("2,4,6");
//        listString.add("3,6,5");
//        listString.add("3,1,2");
        long n= 20;


        long factorial = factorialCalculator(n);
        System.out.println("The Factorial of : "+n +"is " + factorial);
    }

    public static long factorialCalculator(long n) {
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;

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



