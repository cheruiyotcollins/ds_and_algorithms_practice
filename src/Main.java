import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String req = "geeksforgeeks";
        System.out.println(getMaxSub(req));

    }

    public static int getMaxSub(String s) {
        int len = s.length();
        int max = 0;
        HashSet<Character> unique= new HashSet<>();
        for (int i = 0; i < len; i++) {
            unique.clear();
             int k=i+1;

             unique.add(s.charAt(i));
            int count =1;
             while(k<len){
                 if(unique.contains(s.charAt(k))){
                     break;
                 }
                    count++;
                    unique.add(s.charAt(k));

                 k++;
             }
             if(count>max){
                 max=count;
             }
        }
        return max;
    }
}