package L6_Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (List<Integer> i : Triplets(arr, n)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static List<List<Integer>> Triplets(int []arr,int n ){
        List<List<Integer>>list   = new ArrayList<>();
      Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            int j = i+1;
            int k = n-1;
            if(i > 0 && arr[i]==arr[i-1])continue;
            while (j<k){
                long sum  = (long)arr[i]+arr[j]+arr[k];

                if(sum<0){
                    j++;
                } else if(sum>0){
                    k--;
                } else{
                    list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j<k && arr[j] == arr[j+1])j++;
                    while (j<k && arr[k] == arr[k-1])k--;
                    j++;
                    k--;
                }
            }
        }
        return list;
    }
}
