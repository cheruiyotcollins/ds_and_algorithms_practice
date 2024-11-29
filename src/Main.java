import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        solution(X);
    }
    public static void solution(int[] A) {
        int len = A.length;
        int max=0;
        int firstIndex=0;
        int lastIndex=0;

        for (int i = 0; i < len; i++) {
            int sum=0;
         for(int j=i;j<len-1;j++){
             sum+=A[j];
             if(sum>max){
                 max=sum;
                 firstIndex=i;
                 lastIndex=j;
             }
         }
        }
        System.out.println("This is the Sum:"+ max);
        for(int j=firstIndex;j<=lastIndex;j++){
            System.out.print(A[j]);
            if(j!=lastIndex){
                System.out.print(",");
            }
        }

    }
}
