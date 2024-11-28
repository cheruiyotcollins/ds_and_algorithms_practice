import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]  X = {9, 6, 8, 3, 7};

        solution(X);
    }
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Function to shuffle an array `A[]`
    public static void solution(int[] A)
    {
        int len= A.length;
        Arrays.sort(A);
        for (int i =0; i<len-2; i+=2)
        {
            swap(A, i+1, i+2);
        }
        System.out.println(Arrays.toString(A));
    }
    }
