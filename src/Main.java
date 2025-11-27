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
        int[] n ={10, 3, 5, 6, 2};
        for (int element :  maxPrice(n)) {
            System.out.print(element + " "); // Print element followed by a space
        }

    }
    public static int[] maxPrice(int[] n) {
   int len= n.length;
   int[] product=new int[len];
   int max=0;

     for(int i=0;i<len;i++){
         int k=0;
         int currentProduct=1;
        while(k<len){
           if(k!=i){
               currentProduct*= n[k];
           }
            k++;
        }
        product[i]=currentProduct;
     }
     return  product;
    }
}