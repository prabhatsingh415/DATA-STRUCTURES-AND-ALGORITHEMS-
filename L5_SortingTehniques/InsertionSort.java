package L5_SortingTehniques;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = input.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        insertionSort(arr,n);
        System.out.println("sorted array");
        for (int m = 0; m <n ; m++) {
            System.out.print(arr[m]+" ");
        }

    }
    public static void insertionSort(int []arr,int n){
        for (int i = 0; i <n ; i++) {            // outer loop
            int j = i;
            while (j > 0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];          //Swapping
                    arr[j] = temp;
                    j--;
            }
        }
    }
}
