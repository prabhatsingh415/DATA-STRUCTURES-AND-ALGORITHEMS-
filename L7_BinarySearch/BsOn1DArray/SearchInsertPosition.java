package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched in the array.");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target,n));
        sc.close();
    }
    private static int binarySearch(int []arr,int x,int n) {
//        int low = 0;
//        int high = n-1;
//        int ans  = -1;
//        if(arr[high] <x){
//            return high+1;
//        }
//        while(low<=high){
//            int mid = (low + high )/2;
//            if(arr[mid] == x){
//                return mid;
//            }else if (arr[mid]<x){
//               low = mid+1;
//            }else {
//                ans = mid;
//                high = mid-1;
//            }
//
//        }
//        return ans;
       //We Can Also Use lower bound code
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
