import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
//        listString.add("7,1,2");
//        listString.add("2,4,6");
//        listString.add("3,6,5");
//        listString.add("3,1,2");
        listString.add("1,3,7");
        listString.add("3,6,4");
        listString.add("1,1,5");
        listString.add("7,2,4");

        int totalStops = slotWheels(listString);
        System.out.println("Total number of stops: " + totalStops);
    }

    public static int slotWheels(List<String> history) {
        List<int[]> intHistory = stringIntegerConverter(history);
        List<int[]> subHistory= new ArrayList<>();
        List<Integer> totalStopsArr= new ArrayList<>();
        Set<Integer> setInt= new HashSet<>();
        int numWheels = intHistory.getFirst().length;
        int totalStops = 0;
        int maxStops=0;
        int len= intHistory.size();
        for (int i = 0; i < len; i++) {
            maxStops = 0;

            // Find the global maximum value in the remaining array
            for (int[] spin : intHistory) {
                for (int col = 0; col < numWheels; col++) {
                    if (spin[col] > maxStops) {
                        maxStops = spin[col];
                    }
                }
            }
            // Process each spin and update the maximum row value
            for (int[] spin : intHistory) {
                int maxRow = 0;  // Track the maximum value for this row
                int indexMax = -1;  // Track the index of the maximum value

                for (int col = 0; col < numWheels; col++) {
                    // If this column contains the global max, reset it and break
                    if (spin[col] == maxStops && spin[col] != 0) {
                        setInt.add(maxStops); // Add the global maximum to stops array
                        spin[col] = 0; // Set global max to 0
                        break;
                    }

                    // Update maxRow for other columns in the row
                    if (spin[col] > maxRow) {
                        maxRow = spin[col];
                        indexMax = col;
                    }
                }

                // Only reset the local row max if no global max was found
                if (indexMax != -1 && maxRow != maxStops) {
                    spin[indexMax] = 0;
                }


                System.out.println(Arrays.toString(spin));
            }
        }
           System.out.println(setInt);
              for(int j: setInt){
                   totalStops+=j;

              }
        return totalStops;
    }

    public static List<int[]> stringIntegerConverter(List<String> history) {
        List<int[]> integerList = new ArrayList<>();

        for (String s : history) {
            String[] parts = s.split(",");
            int[] integers = Arrays.stream(parts)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            integerList.add(integers);
        }

        return integerList;
    }
}

//   listString.add("1,3,7");
//        listString.add("3,6,4");
//        listString.add("1,1,5");
//        listString.add("7,2,4");

//        [1, 0, 0] 10
//        [3, 0, 4] 3 4
//        [1, 1, 0] 11
//        [0, 2, 4]  24

//        [0, 0, 0]
//        [0, 0, 0]
//        [0, 1, 0]
//        [0, 0, 0]



