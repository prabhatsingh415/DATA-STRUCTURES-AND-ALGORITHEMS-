package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Days");
        int m = sc.nextInt();

        System.out.println("The minimum Capacity is "+shipWithinDays(arr,m));

        sc.close();
    }
    private static int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = totalWeight(weights);

        while (low <= high){
            int mid = (low + high) / 2;
            if(totalDays(weights,mid) <= days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
     return low;
    }
    private static int max(int []arr){
        int ans = Integer.MIN_VALUE;
        for (int i : arr) {
            ans = Math.max(ans,i);
        }
        return ans;
    }
    private static int totalWeight ( int[] arr){
        int total = 0;
        for (Integer i : arr) {
            total += i;
        }
        return total;
    }
    private static int totalDays(int []arr,int mid){
        int days = 1;
        int load = 0;
        for (int j : arr) {
            if (load + j > mid) {
                days++;
                load = j;
            } else {
                load += j;
            }
        }
        return days;
    }
}

