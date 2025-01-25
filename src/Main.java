public class Main {
    public static void main(String[] args) {
        String str = "timetopractice";
        String inp="toc";

        System.out.println(containsAllCharacters(str,inp));
    }


    public static char containsAllCharacters(String str,String inp) {
        char mostOccuring = 0;
        int maxLength = Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int len= str.length();
        for (int i= 0; i< str.length(); i++) {
            String temp=inp;
        char currentChar = str.charAt(i);
         int k=i;
            while (k<len&&!temp.isEmpty()) {
                if(temp.contains(String.valueOf(str.charAt(k))) ){
                    int index = temp.indexOf(str.charAt(k));
                    temp = temp.substring(index + 1);
                }
                k++;
            }

            if (k - i < maxLength) {
                maxLength =k-i;
                start = i;
                end=k;
            }
        }

        System.out.println(start);
        System.out.println(end);
        return mostOccuring;
    }

//    public static List<List<Integer>> stringIntegerConverter(List<String> history){
//        List<List<Integer>> integerList= new ArrayList<>();
//        for(String s: history){
//            String[] parts =s.split(",");
//            List<Integer> integers = new ArrayList<>();
//            for(String part:parts){
//                integers.add(Integer.parseInt(part));
//
//            }
//            integerList.add(integers);
//        }
//        return integerList;
//    }
}



