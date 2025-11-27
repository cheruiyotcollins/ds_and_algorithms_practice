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
        int[] n ={2, 3, -8, 7, -1, 2, 3};
        int[] res= maxPrice(n);
        for (int i=res[0];i<= res[1];i++) {
            System.out.print(n[i] + " "); // Print element followed by a space
        }

    }
    public static int[] maxPrice(int[] n) {
   int len= n.length;
   int[] startStop=new int[2];
   int max=0;

     for(int i=0;i<len;i++){
         int k=i;
         int currentMax=0;

        while(k<len){
            currentMax+=n[k];
           if(currentMax>max){
               max=currentMax;
               startStop[0]=i;
               startStop[1]=k;

           }
            k++;
        }
     }
     System.out.println(max);
     return  startStop;
    }
}