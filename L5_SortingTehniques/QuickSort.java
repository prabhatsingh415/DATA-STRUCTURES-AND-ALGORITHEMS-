package L5_SortingTehniques;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = input.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        int low = 0;
        int high = n-1;
        quickSort(arr,low,high);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void quickSort(int []arr,int low,int high){

        if(low<high){
           int partition = sort(arr,low,high);
           quickSort(arr,low,partition-1);
           quickSort(arr,partition+1,high);
        }
    }
    public static int sort(int []arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j  = high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
                while (arr[j]>pivot && j>=low+1){
                    j--;
                }
                if (i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
