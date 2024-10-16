package L6_Arrays.Medium;

import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,n));
        sc.close();
    }
    public static int sum(int[]arr,int n){
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }

        }
        return maxSum;
    }
}
