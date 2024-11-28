import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = { 1, 2, 3, 4, 5 };

        solution(X);
    }

//    private static void swap(int[] A, int i, int j) {
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }

    public static void solution(int[] A) {
        int len = A.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int product=1;
           for(int j=0;j<len;j++){
               if(j==i){
                   continue;
               }
               product*=A[j];
           }
            result[i]=product;

        }

        System.out.println(Arrays.toString(result));
    }
}
