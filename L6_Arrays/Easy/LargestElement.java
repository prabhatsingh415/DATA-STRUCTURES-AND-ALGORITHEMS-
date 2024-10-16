package L6_Arrays.Easy;

import java.util.Scanner;

//Q1
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest Element In The Array ---> " + Largest(arr,n));
    }
    public static int Largest(int []arr,int n){
        /*
        1.Brute Force Approach
         Sort the array in ascending order.
         Print the (size of the array -1)th index.

        Time Complexity: O(N*log(N))
        Space Complexity: O(n)
        */

        /*
       2.optimal Solution
       Time Complexity: O(N)
       Space Complexity: O(1)
         */
        int large = arr[0];
        for (int i = 1; i <n ; i++) {
            if (arr[i]>large){
                large = arr[i];
            }
        }

        return large;
    }
}
