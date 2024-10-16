package L6_Arrays.Hard;

import java.util.Scanner;

public class MaximumProductSubArrays {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Calculate(arr,n));
    }
    public static int Calculate(int[]arr,int n){
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i  = 0;i<n;i++){
            if(total == 0){
             total = 1;
            }
            total *= arr[i];
            max = Math.max(max,total);
        }
        return max;
    }
}
