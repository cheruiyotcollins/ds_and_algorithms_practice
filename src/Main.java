public class Main {
    public static void main(String[] args) {
        int[] arr= { 1, 0, 1, 0, 1, 0, 0, 1 };
//        int n=10;
        solution(arr);

    }
    static void solution(int[] arr){
        int len=arr.length;
        int j=len;
        int k=0;
        int[] sortedArr=new int[len];
        for(int i=0;i<len;i++){
           if(arr[i]==0){
               sortedArr[k]=arr[i];
               k++;
           }else{
               sortedArr[j-1]=arr[i];
               j--;
           }
        }
        for(int m=0;m<len;m++){
            System.out.print(sortedArr[m]);
            System.out.print(",");
        }

    }
}
