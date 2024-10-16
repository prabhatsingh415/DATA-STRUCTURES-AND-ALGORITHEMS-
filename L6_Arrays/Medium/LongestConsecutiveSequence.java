package L6_Arrays.Medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println( Sequence(arr,n));
        sc.close();
    }
    public static int Sequence (int []a,int n){
 // Brute Force Approach
//        int length =0;
//        for (int i = 0; i < a.length; i++) {
//            int count = 1;
//            int next = a[i]+1;
//            for (int j = 0; j < a.length; j++) {
//
//                if(a[j] == next){
//                    count++;
//                    next++;
//                    j=-1;
//
//                }
//                if(count>length){
//                    length = count;
//                }
//            }
//        }
//        return length;
        Set<Integer> set  = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            set.add(a[i]);
        }
        int length = 0;
        for (int j : a) {
            if (!set.contains(j-1)) {
               int count = 1;
               int start = j;
               while(set.contains(start +1)){
                   count++;
                   start = start + 1;
               }
              length =  Math.max(length,count);
            }
        }
        return  length;
    }
}

