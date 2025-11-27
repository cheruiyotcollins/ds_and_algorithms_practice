import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String code_snippet = bufferedReader.readLine();

        boolean result = areBracketsProperlyMatched(code_snippet);

        System.out.println(result ? 1 : 0);

        bufferedReader.close();
    }
    public static boolean areBracketsProperlyMatched(String code_snippet) {
        // Handle the empty string case (valid)
        if (code_snippet == null || code_snippet.length() == 0) {
            return true;
        }

        // Deque is the preferred interface for stack in modern Java,
        // implementing the Last-In, First-Out (LIFO) principle.
        Deque<Character> stack = new LinkedList<>();

        for (char c : code_snippet.toCharArray()) {

            // 1. Handle Opening Brackets: Push onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // 2. Handle Closing Brackets: Pop and check for match
            else if (c == ')' || c == '}' || c == ']') {

                // Case 1: Stack is empty (Closing bracket without a preceding opener)
                if (stack.isEmpty()) {
                    return false; // Invalid
                }

                char lastOpen = stack.pop(); // Get the most recently opened bracket

                // Case 2: Mismatched brackets (e.g., popping '{' for a ')' )
                if (c == ')' && lastOpen != '(') {
                    return false; // Invalid
                }
                if (c == '}' && lastOpen != '{') {
                    return false; // Invalid
                }
                if (c == ']' && lastOpen != '[') {
                    return false; // Invalid
                }
            }
            // Non-bracket characters are ignored.
        }

        // 3. Final Check: If the stack is empty, all opening brackets were paired
        // with their correct closing bracket.
        return stack.isEmpty() ? true : false;
    }
}