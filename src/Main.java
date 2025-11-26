import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int meetingsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int meetingsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> meetings = new ArrayList<>();

        IntStream.range(0, meetingsRows).forEach(i -> {
            try {
                meetings.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = maximizeNonOverlappingMeetings(meetings);

        System.out.println(result);

        bufferedReader.close();
    }
    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
        if (meetings == null || meetings.isEmpty()) {
            return 0;
        }
        meetings.sort(new Comparator<>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.getLast().compareTo(o2.getLast());
            }
        });
        int count=1;
        int lastEndTime= meetings.getFirst().getLast();
        for(int i=1;i<meetings.size();i++){
            int currentStartTime =  meetings.get(i).getFirst();
            if(currentStartTime>=lastEndTime){
                count++;
                lastEndTime=meetings.get(i).getLast();

            }
        }
        return count;
    }
}