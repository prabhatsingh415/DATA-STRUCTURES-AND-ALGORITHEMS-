package L6_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter The Value Of Sum ");
        int k  = sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,n,k));
        sc.close();
    }
    public static String sum(int[]arr,int n, int k){
        //Optimal Approach
        //Time Complexity  = O(N)+O(NlogN)
        //Time Complexity = O(1)
        //Note: Here we are distorting the given array. So, if we need to consider this change, the space complexity will be O(N).
        Arrays.sort(arr);
        int i  = 0;
        int j  = n-1;

        while (i < j){
            int value =arr[i]+arr[j];
            if(value<k){
                i++;
            }else if(value >k){
                  j--;
            }else {
           return "YES";
            }

        }
        return "NO";
    }
}
