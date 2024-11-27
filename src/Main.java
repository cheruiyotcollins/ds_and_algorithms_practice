public class Main {
    public static void main(String[] args) {
        int[] arr= {8, 7, 2, 5, 3, 1};
        int n=10;
        solution(arr,n);

    }
    static void solution(int[] arr, int n){
        int len=arr.length;
        int matchPairCount=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len-1;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println("Pair found ("+arr[i]+","+arr[j]+")");
                    matchPairCount++;
                }
            }
        }
        if(matchPairCount==0){
            System.out.println("Pair not found");
        }

    }
}
