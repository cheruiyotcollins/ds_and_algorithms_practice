import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]  X = {0, -3, 5, -4, -2, 3, 1, 0};

        solution(X);
    }
//    private static void swap(int[] A, int i, int j)
//    {
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }


    public static void solution(int[] A) {
        int len = A.length;
        for (int i = 0; i < len - 2; i++) {
            int left = i;
            int sumLeft = 0;
            while (left > 0) {
                sumLeft += A[left - 1];
                left--;
            }
            int right = i;
            int sumRight = 0;
            while (right < len-1) {
                sumRight += A[right + 1];
                right++;

            }
            if(sumLeft==sumRight){
                System.out.println("Equilibrium found at "+ i);
            }

        }
    }
}
