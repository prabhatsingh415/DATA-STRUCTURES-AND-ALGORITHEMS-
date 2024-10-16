package L6_Arrays.Hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Length Of Longest SubArray With Sum Zero is "+length(arr,n));
        sc.close();
    }
    public static int length(int []arr,int n){
        //Time Complexity = O(N)
        //Space Complexity = O(N)
        int sum = 0;
        int length =0;
        Map<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i <n ; i++) {
            sum += arr[i];
            if(sum == 0){
                length = i+1;
            }else {
                if(mpp.containsKey(sum)){
                    length = Math.max(length,i-mpp.get(sum));
                }else {
                    mpp.put(sum,i);
                }
            }
        }
        return length;
    }
}
