import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String req = "geeekk";
        System.out.println(getMaxSub(req));

    }

    public static HashMap<Character, Integer> getMaxSub(String s) {
        int len = s.length();
        HashMap<Character,Integer> maxMap= new HashMap<>();
        int max=0;
        for (int i = 0; i < len; i++) {
            char current= s.charAt(i);
            int currentMax=1;
            int k=i+1;
            while(k<len && current==s.charAt(k)){
                currentMax++;
                k++;
            }
            if(currentMax>max){
                max=currentMax;
                maxMap.clear();
                maxMap.put(current,max);
            }

        }
        return maxMap;
    }
}