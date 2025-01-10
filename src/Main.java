import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(stringReversal(str));
    }

    public static String stringReversal(String str) {
        String[] strArray= str.split("\\.");
        int len=strArray.length;
        String[] reversedStr=new String[len];
        int j=len-1;
        for (String s : strArray) {
            reversedStr[j] = s;
            j--;
        }
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<len;i++){
            if(!reversedStr[i].isEmpty()){
            stringBuilder.append(reversedStr[i]);
            }
            if(i!=len-1&&!reversedStr[i].isEmpty()){
                stringBuilder.append(".");
            }
        }

        return stringBuilder.toString();
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



