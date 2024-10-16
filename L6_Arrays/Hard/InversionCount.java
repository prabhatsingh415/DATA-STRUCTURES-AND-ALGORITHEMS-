package L6_Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InversionCount {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n-1;
        System.out.println(Count(arr,low,high));
    }
    public static int  Count(int []arr,int low,int high ){
        //Time complexity = O(N Log N)
        //Space complexity = O(N)
        int result = 0;
        if (low == high) return result;
        int mid = (low + high) / 2;
        result += Count(arr, low, mid);
        result += Count(arr, mid + 1, high);
        result += check(arr, low, mid, high);
        return result;
    }
  public static int check(int[]arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid+1;
        while( left<=mid && right<=high){
           if(arr[left]<=arr[right]){
               list.add(arr[left]);
           left++;
           }else  {

               list.add(arr[ right]);
               count += (mid - left) + 1;    // Counting Inversions
              right++;
           }
        }
        while (left<=mid){
            list.add(arr[left]);
            left++;

        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
      for (int i = low; i <= high; i++) {
          arr[i] = list.get(i - low);
     }
   return count;
  }
}
