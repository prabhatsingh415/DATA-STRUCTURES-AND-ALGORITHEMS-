package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class FloorAndCeil {
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
        for (int i : getFloorAndCeil(arr, n, target)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Write your code here.
        int floor = floor(a,n,x);
        int ceil = ceil(a,n,x);
        return new int[] {floor,ceil};
    }

    private static int floor(int []arr,int n,int x){    // floor
        int floor = -1;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low + high)/2;
            if(arr[mid] <= x){
                floor = arr[mid];
                low = mid +1;
            }else  if(arr[mid] >= x){
                high  = mid- 1;
            }
        }
        return floor;
    }
    private static int ceil(int []arr,int n,int x){    // Ceil
        int ceil = -1;                                //lowerBound
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ceil = arr[mid];
                high = mid -1;
            }else{
                low = mid+ 1;
            }
        }
        return ceil;
    }
}
