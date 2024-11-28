import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] x= { 1, 4, 7, 8, 10 };
        int[] y= { 2, 3, 9 };
        solution(x,y);
    }
    static void solution(int[] X, int[] Y){
        int m = X.length;
        int n = Y.length;

        // Consider each element `X[i]` of array `X` and ignore the element if it is
        // already in the correct order; otherwise, swap it with the next smaller
        // element, which happens to be the first element of `Y`.
        for (int i = 0; i < m; i++)
        {
            // compare the current element of `X[]` with the first element of `Y[]`
            if (X[i] > Y[0])
            {
                // swap `X[i]` with `Y[0]`
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                int first = Y[0];

                // move `Y[0]` to its correct position to maintain the sorted
                // order of `Y[]`. Note: `Y[1…n-1]` is already sorted
                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }

                Y[k - 1] = first;
            }
        }









        for(int k=0;k<m;k++){
            System.out.print(X[k]);
            if(k!=m-1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for(int z=0;z<n;z++){
            System.out.print(Y[z]);
            if(z!=n-1) {
                System.out.print(",");
            }
        }
    }
}
