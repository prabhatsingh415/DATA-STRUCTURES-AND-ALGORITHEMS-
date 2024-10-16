package L6_Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePairs {
    //Time Complexity = O(N Log N)
    //Space Complexity = O(N)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = input.nextInt();
        System.out.println("Enter The Elements Of Array");
        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        int low = 0;
        int high = n-1;
        System.out.println( mergeSort(arr,low,high));
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
    public static int count(int[]arr,int low,int mid,int high ){
        int count = 0;
        int right = mid+1;

        for (int i = low;i<=mid;i++){
            while(right<=high && arr[i]>2*arr[right]){
                right++;
            }
            count += (right - (mid + 1));   // Counting The Number Of Pairs
        }
        return count;
    }
    public static int mergeSort(int []arr,int low,int high){
        int result = 0;
        if (low>= high)return result;
        int mid = (low+high)/2;
        result += mergeSort(arr,low,mid);
        result += mergeSort(arr,mid+1,high);
        result += count(arr,low,mid,high);
        merge(arr,low,mid,high);
        return result;
    }
}
