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
        int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int budget = Integer.parseInt(bufferedReader.readLine().trim());

        int result = countAffordablePairs(prices, budget);

        System.out.println(result);

        bufferedReader.close();
    }

    public static int countAffordablePairs(List<Integer> prices, int budget) {
        int count=0;
        int len =prices.size();

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(prices.get(i)+prices.get(j)<=budget){
                    count++;
                }
            }
        }

        return count;

    }
}