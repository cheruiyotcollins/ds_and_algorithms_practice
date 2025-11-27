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

        String digits = bufferedReader.readLine();

        List<String> result = minTasksToCancelForNoConflict(digits);

        System.out.println(
                result.stream()
                        .collect(joining("\n"))
        );

        bufferedReader.close();
    }

    private static final Map<Character, String> MAPPING = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
        put('0', "0");
        put('1', "1");
    }};

    public static List<String> minTasksToCancelForNoConflict(String digits) {
        List<String> combinations= new ArrayList<>();
        if(digits.isEmpty()||digits.length()==0){
            return combinations;
        }


        backtrack(digits,0, new StringBuilder(),combinations);

        return combinations;

    }
    private static void backtrack(String digits,int index,StringBuilder currentCombination,List<String> combinations){
        if(index==digits.length()){
            combinations.add(currentCombination.toString());
        }

        ;
        if (index >= digits.length()) {
            return;
        }
        char digit= digits.charAt(index);
        String letters= MAPPING.get(digit);
        if(letters==null){
            return;

        }
        for(char letter: letters.toCharArray()){
            currentCombination.append(letter);
            backtrack(digits,index+1,currentCombination,combinations);
            currentCombination.deleteCharAt(currentCombination.length()-1);

        }
    }
}