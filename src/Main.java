import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = { 2, 7, 9, 5, 1, 3, 5 };
        solution(X);
    }
    public static void solution(int[] A) {
        int len = A.length;
        int max=0;
        int fist=0;
        int second=0;

        for (int i = 0; i < len; i++) {
         for(int j=i+1;j<len-1;j++){
             if(A[j]-A[i]>max){
                 max=A[j]-A[i];
                 fist=i;
                 second=j;
             }
         }



        }
        System.out.println(A[fist]+" and the second element is: "+ A[second]+" This is the difference>:"+ max);

    }
}
