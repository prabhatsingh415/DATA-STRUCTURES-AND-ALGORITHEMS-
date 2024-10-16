package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class KthMissingPositiveInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Missing number To be found");
        int  k= sc.nextInt();
        System.out.println("missing number is "+findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low + high )/ 2;
           int missing = arr[mid] - (mid + 1);
           if(missing < k) low = mid+1;
           else high = mid - 1;
        }
        return low + k;
    }
}
