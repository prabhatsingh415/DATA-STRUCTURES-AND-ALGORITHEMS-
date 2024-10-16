package L6_Arrays.Easy;

import java.util.Scanner;

public class NumberAppearingOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The First Array ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the elements of first the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(check(arr1,n));
        sc.close();
    }
    public static int check(int []arr,int n){
        /*Brute Force Approach
       -> For every element present in the array, we will do a linear search and count the occurrence.
          If for any element, the occurrence is 1, we will return it.

       -> Time Complexity: O(N2), where N = size of the given array.
        Reason: For every element, we are performing a linear search to count its occurrence.
        The linear search takes O(N) time complexity. And there are N elements in the array.
        So, the total time complexity will be O(N2).

       ->Space Complexity: O(1) as we are not using any extra space.
         */

        /*Better Approach
         -> Array hashing(not applicable if the array contains negatives or very large numbers)
         -> Hashing using the map data structure

         ->  Time Complexity: O(N)+O(N)+O(N), where N = size of the array
             Reason: One O(N) is for finding the maximum, the second one is to hash
             the elements and the third one is to search the single element in the array.

         -> Space Complexity: O(maxElement+1) where maxElement = the maximum element of the array.
         */
        /*Optimal Approach
        -> Time Complexity  = O(N)
        -> Space Complexity = O(1)
        */
        int num  = 0;
        for (int i = 0; i <n ; i++) {
            num  = num ^ arr[i];
        }
        return num;
    }
}
