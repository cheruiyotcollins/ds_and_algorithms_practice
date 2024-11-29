import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] X = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};
        int k = 1;
        solution(X, k);
    }

    public static void solution(int[] A, int n) {
        int len = A.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i; j < len; j++) {
                if (A[j] == 1) {
                    count++;

                } else {
                    if (n == 0) {
                        break;
                    } else {
                        int k = n;
                        int m = j;
                        while (k > 0 && m < len) {
                            if (A[m] == 0) {
                                count++;
                                k--;
                                m++;
                            } else if (A[m] == 1) {
                                count++;
                                m++;
                            }


                        }
                    }
                }
                if (count > max) {
                    max = count;
                }
            }

        }
        System.out.println(max);

    }
}