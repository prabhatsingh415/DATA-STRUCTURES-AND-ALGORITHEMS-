package L6_Arrays.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Sum Of The SubArrays");
        int k = sc.nextInt();
        System.out.println( "Number Of SubArrays Are "+SubArray(arr,n,k));
    }
    public static int SubArray(int []arr,int n,int k){
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
