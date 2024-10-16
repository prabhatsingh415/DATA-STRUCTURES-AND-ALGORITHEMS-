package L6_Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Targeted Sum");
        int target = sc.nextInt();
        for (List<Integer> i : Quads(arr, n,target)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static List<List<Integer>> Quads(int []arr,int n,int target){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <n-3 ; i++) {
            if(i>0 && arr[i] == arr[i-1])continue;
            for (int j = i+1; j <n-2 ; j++) {
                if(j>i+1 && arr[j] == arr[j-1])continue;
                int k  = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum<target){
                        k++;
                    }else if (sum>target) {
                        l--;
                    }else {
                        list.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        while(k<l && arr[k] == arr[k+1])k++;
                        while(k<l && arr[l] == arr[l-1])l--;
                        k++;
                        l--;
                    }
                }
            }
        }

        return list;
    }
}
