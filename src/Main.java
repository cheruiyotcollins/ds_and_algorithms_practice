import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2="skeeg";
        System.out.println(findAnagram(s1,s2));
    }


    public static boolean findAnagram(String s1, String s2) {
        boolean isAnagram=true;
        int len= s1.length();
        int j=len-1;
       for(int i=0;i<len;i++){
           if(s1.charAt(i)!=s2.charAt(j)){
               System.out.println(s1.charAt(i));
               System.out.println(s1.charAt(j));
               isAnagram=false;
               break;
           }
           j--;
       }


        return  isAnagram;
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



