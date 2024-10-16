package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Number Of students");
        int st = sc.nextInt();
        System.out.println(allocation(arr, n, st));
        sc.close();
    }

    private static int allocation(int[] arr, int n, int students) {
        /*Time Complexity: O(N * log(sum(arr[])-max(arr[])+1)),
        where N = size of the array, sum(arr[]) = sum of all array elements,
        max(arr[]) = maximum of all array elements.*/
        if (n < students) {
            return -1;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            max = Math.max(max, i);
        }
        int low = max;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(arr, mid) > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int check(int[] arr, int mid) {
        int students = 1;
        int pages = 0;
        for (int i : arr) {
            if (pages + i <= mid) {
                pages += i;
            } else {
                students++;
                pages = i;
            }
        }
        return students;
    }
}
