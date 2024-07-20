package L5_SortingTehniques;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
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
        mergeSort(arr,low,high);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void merge(int []arr,int low,int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left  = low;
        int right = mid+1;
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }

        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        // transferring all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }
    public static void mergeSort(int []arr,int low,int high){
         if (low == high)return;
         int mid = (low+high)/2;
         mergeSort(arr,low,mid);
         mergeSort(arr,mid+1,high);
         merge(arr,low,mid,high);
    }
}
