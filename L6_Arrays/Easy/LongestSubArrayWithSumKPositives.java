package L6_Arrays.Easy;

import java.util.Scanner;

public class LongestSubArrayWithSumKPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter The Value Of Sum Of SubArray");
        int k  = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Length Of Longest SubArray Is "+longestSubArray(arr,n,k));
        sc.close();
    }
    public static int longestSubArray(int []arr,int n, int k){
        //Time Complexity  = O(2N)
        //Time Complexity  = O(1)
        int i  = 0;
        int j = 0;
        int sum = arr[0];
        int length = 0;
        while(i<n){
            while (j<=i && sum > k){
                sum -= arr[j];
                j++;
            }
            if(sum == k){
                length  =  Math.max(length,i-j+1);
            }
            i++;
            if(i<n) sum+=arr[i];
        }
        return length;
    }
}
