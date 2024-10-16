package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Size Of The Array");
            int n = sc.nextInt();
            int [] arr = new int [n];
            System.out.println("Enter The Element Of The Array");
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("The minimum number is "+findMin(arr));
            sc.close();
    }
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[high]) {
                min = Math.min(min, arr[low]);
                break;
            }

            // Compare mid_element with high to determine which side to search
            if (arr[low] <= arr[mid]) {
                // The minimum element is in the right half
                min = Math.min(min, arr[low]);
                low = mid + 1;
            } else {
                // The minimum element is in the left half (including mid)
                high = mid - 1;
                min = Math.min(min, arr[mid]);

            }
        }
        return min;
    }
}
