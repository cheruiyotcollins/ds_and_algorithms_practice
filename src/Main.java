import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> s = new ArrayList<>(Arrays.asList("act", "god", "cat", "dog", "tac"));
        System.out.println(groupAnagram(s));

    }

    public static List<List<String>>  groupAnagram(List<String> s) {
        int len = s.size();
        Collections.sort(s);
        List<String> sortedS= new ArrayList<>();
        List<List<String>> anagrams= new ArrayList<>();
        for(int i=0; i<len;i++){
            String originalString= s.get(i);
            char[] sortedChar= originalString.toCharArray();
            Arrays.sort(sortedChar);
            String sortedString= new String(sortedChar);
            sortedS.add(sortedString);
        }
        int count= 0;
        for (int i = 0; i < len; i++) {
           int k=i+1;


            anagrams.add(new ArrayList<>(Arrays.asList(s.get(i))));
            while(k<len ){
            if(sortedS.get(i).equals(sortedS.get(k))){
                anagrams.getLast().add(s.get(k));
            }
                k++;
            }
            if(anagrams.getLast().size()==1){
                anagrams.removeLast();
            }
            count++;

        }
        return anagrams;
    }
}