import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
        int[][] intervals = {
                {1, 3},
                {4, 5},
                {6, 7},
                {8, 10}
        };
        int[] newInterval={5,6};

        ArrayList<int[]> intervalOutput = insertInterval(intervals,newInterval);
        for (int[] interval : intervalOutput) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static ArrayList<int[]> insertInterval(int[][] arr, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        Collections.addAll(res, arr);

        int i = 0;
        int len = res.size();

        // Add intervals before newInterval
        while (i < len && res.get(i)[1] < newInterval[0]) {
            i++;
        }

        // Merge overlapping intervals
        while (i < len && res.get(i)[0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], res.get(i)[0]);
            newInterval[1] = Math.max(newInterval[1], res.get(i)[1]);
            res.remove(i);
            len--;
        }

        // Insert the merged interval
        res.add(i, newInterval);

        return res;
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



