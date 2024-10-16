package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class FindTheSmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Limit");
        int m = sc.nextInt();

        System.out.println("The minimum divisor is "+smallestDivisor(arr,m));
        sc.close();
    }
    public static int smallestDivisor(int[] numbs, int threshold) {
        //Time Complexity = O(log(Max(arr[]) * N)
        //where max(arr[]) = maximum element in the array, N = size of the array.
        if (numbs.length > threshold) {
            return -1;
        }
        int low = 1;
        int high = max(numbs);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sum(numbs, mid) <= threshold) {
                high = mid - 1;
            } else {
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
    private static int sum(int [] numbs ,int mid){
        int ans = 0;
        for (int num : numbs) {
            ans += (int) Math.ceil((double) num / mid);
        }
        return ans;
    }
}

