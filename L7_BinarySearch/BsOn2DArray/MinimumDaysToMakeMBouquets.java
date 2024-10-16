package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class MinimumDaysToMakeMBouquets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Number Of Bouquets");
        int m = sc.nextInt();
        System.out.println("Enter the number of adjacent flowers you need");
        int k = sc.nextInt();
        System.out.println("The minimum number of days you need to wait to be able to make "+m+" bouquets from the garden are "+minDays(arr,m,k));
        sc.close();
    }
    private static int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long) m * k;
        if(totalFlowers > bloomDay.length){
            return -1;
        }
        int low = min(bloomDay);
        int high = max(bloomDay);
        while (low <= high){
            int mid = (low + high)/2;
            if(countFlower(bloomDay,mid,k)>=m){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
    private static int min(int []arr){
        int ans = Integer.MAX_VALUE;
        for (int j : arr) {
            ans = Math.min(ans, j);
        }
        return ans;
    }
    private static int max(int []arr){
        int ans = Integer.MIN_VALUE;
        for (int i : arr) {
            ans = Math.max(ans,i);
        }
        return ans;
    }
    private static int countFlower(int []arr,int m,int k){
        int noOfBouquets = 0;
        int cnt = 0;
        for (int i : arr) {
            if(i <= m){
                cnt++;
            }else{
              noOfBouquets +=   cnt / k;
                cnt = 0;
            }
        }
        noOfBouquets +=  cnt / k;
        return noOfBouquets;
    }
}
