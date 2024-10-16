package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class SearchInARotatedSortedArray {
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
        System.out.println("The given number is found at "+search(arr,target,n)+" index");
        sc.close();
    }
    private static int search(int []numbs,int target,int n){

        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid  = (low + high)/2;
            if(numbs[mid] == target){
                return mid;
            }
            if(numbs[low]<=numbs[mid]){
                if(numbs[low]<=target && target<=numbs[mid]){
                    high  = mid - 1;
                }else{
                    low = mid +1;
                }
            }else{
                if(numbs[mid]<=target && target<=numbs[high]){
                    low  = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
