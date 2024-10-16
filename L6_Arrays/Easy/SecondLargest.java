package L6_Arrays.Easy;

import java.util.Scanner;

//Q2
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Second Largest Element In The Array ---> " + SecLargest(arr,n));
    }
    public static int SecLargest(int []arr,int n){
        /*
        1. Brute Force Approach
        Sort the array in ascending order
        The element present at the second index is the second_smallest element
        The element present at the second index from the end is the second_largest element

        Time Complexity: O(NlogN), For sorting the array
        Space Complexity: O(1)
        */

        /*
        2. Better Approach
        Find the smallest and largest element in the array in a single traversal
       After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
      Similarly, we would find the largest element which is just smaller than the largest element we just found
      Indeed, this is our second smallest and second_largest element.

      Time Complexity: O(N), We do two linear traversals in our array
      Space Complexity: O(1)
      */


        //Time complexity is O(n)
        //Space Complexity is O(1)
        if(n<2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
