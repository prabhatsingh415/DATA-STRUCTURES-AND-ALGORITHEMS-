package L6_Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrayWithSumKPositivesAndNegatives {
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

        long sum = 0;
        int length  = 0;
        Map<Long,Integer> map  = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            sum += arr[i];
            if(sum == k){
                length = i+1;
            } else if (map.containsKey(sum-k)) {
                length  = Math.max(length,i-map.get(sum-k));
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return length;
    }
}
