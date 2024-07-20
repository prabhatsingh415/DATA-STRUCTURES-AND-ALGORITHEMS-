package L5_SortingTehniques;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = input.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        selectionSort(arr,n);
        System.out.println("sorted array");
        for (int m = 0; m <n ; m++) {
            System.out.print(arr[m]+" ");
        }
    }

    public static void selectionSort(int []arr,int n){
     //   Time complexity is O(n^2), which applies to the best, worst, and average cases
        for (int i = 0; i <=n-2 ; i++) {
            int min  = i;
            for (int j = i; j <=n-1 ; j++) {      //Loop For Finding Minimum between i to n-1
                if (arr[j]<arr[min]){
                    min  = j;
                }
            }
            // Swapping the minimum element with the array's i-th element
            // The minimum element is swapped with arr[i] in each iteration of i
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
