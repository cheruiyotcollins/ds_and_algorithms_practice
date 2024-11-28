import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = {6, 0, 8, 2, 3, 0, 4, 0, 1};

        solution(X);
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void solution(int[] A) {
        int len = A.length;
        int index = len - 1;  // Start from the end of the array

        for (int i = 0; i < len; i++) {
            if (A[i] == 0 && A[index] != 0) {
                swap(A, i, index);  // Swap non-zero element with zero
                index--;  // Move the index backward to place the next zero
            }
            if(A[i] == 0&&i+1<len&&A[i+1]!=0){
                swap(A, i, i+1);
            }
            else if (A[i] != 0) {
                continue;
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
