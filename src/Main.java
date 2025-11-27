import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        long result = getAutoSaveInterval(n);

        System.out.println(result);

        bufferedReader.close();
    }
    public static long getAutoSaveInterval(int n) {

        List<Long> fibonacci = new ArrayList<>();

        // Handle base cases F(0) and F(1) explicitly
        if (n == 0) {
            return 1L; // F(0) = 1
        }
        if (n == 1) {
            return 2L; // F(1) = 2
        }

        // Initialize the first two terms in the list
        fibonacci.add(1L); // F(0)
        fibonacci.add(2L); // F(1)

        // Start the loop from the calculation of F(2) up to F(n)
        // The list size will be (i+1). If we want F(i), we check the last two elements.
        for (int i = 2; i <= n; i++) {
            // F(i) = F(i-1) + F(i-2)
            // F(i-1) is the element at index (i-1) in the list.
            // F(i-2) is the element at index (i-2) in the list.
            long nextTerm = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(nextTerm);
        }

        // The n-th term is stored at index n
        return fibonacci.get(n);
    }
}