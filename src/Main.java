import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };

        solution(X);
    }
    public static void solution(int[] A) {
        int len = A.length;
        int max=0;
        int begin=0;
        int end=0;
        for (int i = 0; i < len; i++) {
            int k=i;
            int countAsc=0;
            int countDesc=0;

          while(k<len-1&&A[k]<A[k+1]){
              countAsc++;
              k++;
          } if(k+1<len&&A[k]>A[k+1]){
                while(k<len-1&&A[k]>A[k+1]){
                    countDesc++;
                    k++;
                }
            }
          if(countAsc+countDesc>max){
             begin=i;
             end=k;
              max=countAsc+countDesc;
          }

        }

        for(int j=begin;j<=end;j++){
            System.out.print(A[j]);
            if(j!=end){
                System.out.print(",");
            }

        }
    }
}
