package L6_Arrays.Medium;

import java.util.Scanner;

public class PrintSubArrayUsingKadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        PrintSubArray(arr,n);
        sc.close();
    }
    public static void PrintSubArray(int []arr,int n ){
        int max = 0;
        int sum  = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
           if(sum == 0){
                start = i;
           }
           if(sum>max){
               max = sum;
               ansStart = start;
             ansEnd = i;
           }
           if(sum<0){
               sum = 0;
           }
        }
        for (int i = ansStart; i <ansEnd ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
