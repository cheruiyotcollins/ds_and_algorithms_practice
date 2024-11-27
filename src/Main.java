import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr= { 0, 0, 1, 0, 1, 0, 0 };
        solution(arr);
    }
    static void solution(int[] arr){
        int len=arr.length;
        int begin=0;
        int end=0;

        for(int i=0;i<len;i++){
            int m=i;
            int zero=0;
            int one=0;
          while(m<len){
              if(arr[m]==0){
                  zero++;
              }else{
                  one++;
              }
              if(zero==one && (m-i)>(end-begin)){
                  end=m;
                  begin=i;
              }
              m++;
          }
        }
        for(int k= begin;k<=end;k++){
            System.out.print(arr[k]);
            if(k!=end) {
                System.out.print(",");
            }
        }


    }
}
