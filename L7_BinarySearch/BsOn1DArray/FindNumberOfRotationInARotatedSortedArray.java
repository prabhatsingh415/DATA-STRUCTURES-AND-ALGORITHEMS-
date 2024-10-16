package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class FindNumberOfRotationInARotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findKRotation(arr));
        sc.close();
    }
    public static int findKRotation(int []arr){
        int low = 0;
        int high = arr.length-1;
        int min  = Integer.MAX_VALUE;
        int index = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[low]<=arr[high]){

                if(arr[low]<=min){
                    min = arr[low];
                    index = low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=min){
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            }else{
                high = mid - 1;
                if(arr[mid]<=min){
                    min = arr[mid];
                    index = mid;
                }
            }
        }
        return index;
    }
}
