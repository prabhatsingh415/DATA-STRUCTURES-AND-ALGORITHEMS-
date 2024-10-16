package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Single number is " + search(arr, n));
        sc.close();
    }
    public static int search(int[] numbs , int  n) {
        if(n == 1){
            return numbs[0];
        }
        if(numbs[0] != numbs[1]){
            return numbs[0];
        }
        if(numbs[n-1] != numbs[n-2]){
            return numbs[n-1];
        }
        int low = 1;
        int high = n - 2;
        while(low <= high){
            int mid = (low + high)/2;
            if(numbs[mid] != numbs[mid+1] && numbs[mid] != numbs[mid - 1]){
                return numbs[mid];
            }
            if(mid % 2 == 0 && numbs[mid] == numbs[mid + 1]
                    || mid % 2 == 1 && numbs[mid] == numbs[mid - 1]){
                low = mid +1;
            }else{
                high  = mid-1;
            }
        }
        return -1;
    }
}
