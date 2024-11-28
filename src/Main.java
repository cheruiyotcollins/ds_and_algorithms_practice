import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[]  X = {-10, -3, 5, 6, -2};
        solution(X);
    }
    static void solution(int[] X){
        int m = X.length;
        int max=0;
        for (int i = 0; i < m; i++)
        {
             for(int j=i+1;j<m-1;j++) {
                 if(X[i]*X[j]>max) {
                    max=X[i]*X[j];
                 }
             }

        }
        System.out.println(max);

//        for(int k=0;k<m;k++){
//            System.out.print(X[k]);
//            if(k!=m-1) {
//                System.out.print(",");
//            }
//        }
//        System.out.println();
//        for(int z=0;z<n;z++){
//            System.out.print(Y[z]);
//            if(z!=n-1) {
//                System.out.print(",");
//            }
//        }
    }
}
