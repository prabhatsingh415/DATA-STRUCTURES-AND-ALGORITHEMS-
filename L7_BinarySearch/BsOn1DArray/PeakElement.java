package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Peak number is " + search(arr, n));
        sc.close();
    }
    private static int search(int []arr,int n){
        if(n == 0){
            return arr[0];
        }
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        int low = 1;
        int high = n-2;
        while (low<=high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid + 1]){
                return arr[mid];
            } else if (arr[mid]>arr[mid-1]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
