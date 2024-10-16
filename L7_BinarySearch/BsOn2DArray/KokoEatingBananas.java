package L7_BinarySearch.BsOn2DArray;
import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Time ");
        int hours = sc.nextInt();
        System.out.println(search(arr, hours));
        sc.close();
    }
    private static int search(int []arr , int hour){
        int low = 1;
        int high = max(arr);

        while (low<=high){
            int mid = (low + high)/2;
            long totalTime = time(arr,mid);
            if(totalTime <= hour){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
    private static int max(int []arr){
        int ans = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > ans) {
                ans = j;
            }
        }
        return ans;
    }
    private static long time(int []arr , int i){
        long ans = 0;
        for (int k : arr) {
            ans += (long) Math.ceil((double) k / i);
        }
        return ans;
    }
}
