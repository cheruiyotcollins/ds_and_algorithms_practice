import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(5);
//        arr.add(4);
//        arr.add(3);
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m=5;

//        long n= 20;


        int volume = areaCalculator(arr,m);
        System.out.println("The Maximum volume is : " + volume);
    }

    public static int areaCalculator(int[] arr, int m) {
        int res = Integer.MAX_VALUE;
         Arrays.sort(arr);
        // For every element of the array
        int n = arr.length;

        // Sort the given packets
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {

            // calculate difference of current window
            int diff = arr[i + m - 1] - arr[i];

            // if current difference is smaller
            // then update the minimum difference
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;



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



