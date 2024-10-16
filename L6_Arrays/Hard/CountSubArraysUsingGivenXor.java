package L6_Arrays.Hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubArraysUsingGivenXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Xor");
        int Xor = sc.nextInt();
        System.out.println( count(arr,Xor,n));
        sc.close();
    }
    public static int count(int[]arr,int k,int n){
        // Time Complexity = O(N)
        // Space Complexity = O(N)
        int xr = 0;
        int cnt = 0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(xr,1); // Adding Zero into The Hashmap

        for (int i = 0; i <n ; i++) {
            /*Formula :- Xr = Xr ^ a[i]
            X = Xr ^ K*/
            xr ^= arr[i];  // Xor of All Elements Till Index
            int x = xr^k;
            if(map.containsKey(x)){
                cnt+=map.get(x); // If Map Contains X Than Adding The Occurrence Of X In Count
            }
            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);    // If Map Contains Xr Than Increment The Occurrence of Xr By 1 In The Map
            }else{
                map.put(xr,1);    // If It Doesn't Contain It The Xr Than Add It With 1 Occurrence
            }
        }
        return cnt;

    }
}
