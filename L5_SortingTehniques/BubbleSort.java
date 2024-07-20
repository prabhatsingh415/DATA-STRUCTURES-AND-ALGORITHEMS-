package L5_SortingTehniques;

import java.util.Scanner;

public class BubbleSort {
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
    public static void bubbleSort(int []arr,int n){
        //O(n^n) Time Complexity For Worst And Average Case
        //O(n) Time Complexity For Best Case
        for (int i = n-1; i >=0 ; i--) {//Outer Loop
            int didSwap = 0;
            for (int j = 0; j <=i-1 ; j++) {                //Inner Loop
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];            //Swapping
                    arr[j] = temp;
                    didSwap = 1;
             }
        }
            if (didSwap==0){
                break;               // Optimizing For Best Case
            }
    }
}
}
