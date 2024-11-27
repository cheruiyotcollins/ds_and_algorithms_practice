public class Main {
    public static void main(String[] args) {
        int[] arr= { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
//        int n=10;
        solution(arr);

    }
    static void solution(int[] arr){
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            int sum=arr[i];
            int j=i+1;
            while(j<len &&sum!=0){
              sum+=arr[j];
              if(sum==0){
                  int k=i;
                  System.out.println("SubArray Found\n");
                  while(k<=j){
            System.out.print(arr[k]);
            System.out.print(",");
            k++;
        }
              }
              j++;
            }
        }

    }
}
