import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(3);

//        long n= 20;


        int area = areaCalculator(arr);
        System.out.println("The Maximum volume is : " + area);
    }

    public static int areaCalculator(List<Integer> arr) {
        int area=0;
        int len= arr.size();
        int width=0;
        int height=0;

        for(int i=1;i<=len;i++){
            for(int j=i+1;j<len;j++){
                width=j-i;
              height=Math.min(arr.get(i),arr.get(j));
                if(width*height>area){
                    area=width*height;
                }
            }
        }
        return area;

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



