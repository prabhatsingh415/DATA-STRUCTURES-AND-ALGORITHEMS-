package L5_SortingTehniques;

import java.util.Scanner;

public class recursiveBubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = input.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }

        bubbleSort(arr,n);
        System.out.println("sorted array");
        for (int m = 0; m <n ; m++) {
            System.out.print(arr[m]+" ");
        }
    }
    public static void bubbleSort(int[]arr,int n){
        if (n == 1) {
            return;
        }
        int didSwap = 0;
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];            //Swapping
                arr[i] = temp;
                didSwap = 1;
            }
        }
        if (didSwap == 0) return;
        bubbleSort(arr,n-1);
    }
}
