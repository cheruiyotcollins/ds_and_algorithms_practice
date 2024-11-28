import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]  X = {-10, -3, 5, 6, -2};
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
        for (int i = len - 1; i >= 1; i--)
        {
            Random rand = new Random();

            int j = rand.nextInt(i + 1);

            swap(A, i, j);
        }
        System.out.println(Arrays.toString(A));
    }
    }

