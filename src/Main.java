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
        List<List<Integer>> intHistory= stringIntegerConverter(history);
        Set<Integer> setInt= new HashSet<>();
        int totalStops=0;
        int maxStops=0;
        for(List<Integer> spin: intHistory){
            for(int col=0;col<spin.size();col++){
                if(spin.get(col)>maxStops){
                    maxStops=spin.get(col);
                }
            }
        }
        for(List<Integer> spin: intHistory){
            int maxRow=0;
            int indexMax=-1;
            int temp=0;
            for(int col=0;col<spin.size();col++){
                if(spin.get(col)==maxStops&&spin.get(col)!=0){
                    setInt.add(maxStops);
                    spin.remove(col);
                    if(spin.size()==1){
                        temp=spin.get(0);
                    }
                    break;
                }
                if(spin.get(col)>maxRow&&spin.get(col)!=maxStops){
                    maxRow=spin.get(col);
                    indexMax=col;
                }
            }
            if(indexMax!=-1&&maxRow!=maxStops){
                spin.remove(indexMax);
            }
            if(temp>0){
                spin.add(temp);
            }
        }


        for(int j: setInt){
            totalStops+=j;
        }
        return totalStops;

    }
    public static List<List<Integer>> stringIntegerConverter(List<String> history){
        List<List<Integer>> integerList= new ArrayList<>();
        for(String s: history){
            String[] parts =s.split(",");
            List<Integer> integers = new ArrayList<>();
            for(String part:parts){
                integers.add(Integer.parseInt(part));

            }
            integerList.add(integers);
        }
        return integerList;
    }
}



