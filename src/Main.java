import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] n ={7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxPrice(n));
    }
    public static long maxPrice(int[] n) {
   int len= n.length;
   int max=0;

     for(int i=0;i<len;i++){
         int k=i+1;
        while(k<len&&n[k]>n[i]){
            if(n[k]-n[i]>max){
               max= n[k]-n[i];
            }
            k++;
        }
     }
     return  max;
    }
}