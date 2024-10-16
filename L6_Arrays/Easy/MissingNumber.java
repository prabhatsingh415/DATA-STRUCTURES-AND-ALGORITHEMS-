package L6_Arrays.Easy;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The First Array ");
        int n = sc.nextInt();

        int[] arr1 = new int[n-1];
        System.out.println("Enter the elements of first the array: ");
        for (int i = 0; i < n-1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(missing(arr1,n));
        sc.close();
    }
    public static int missing(int []arr,int n ){
        //Brute Force Solution  :- We Can Use Two Pointers To Compare Arrays Elements With N Natural Numbers
        //Better Solution :- We Can Use A Hash Array
        //optimal solution :-
        //Time Complexity  = O(N)
        //Space Complexity  = O(1)
         int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ (i+1); //calculating xor of all numbers from 0 to n - 1
            xor2 = xor2 ^ arr[i]; // calculating xor of elements of array
        }
        xor1 = xor1 ^ n;  //calculating xor of n
        return  xor1 ^ xor2;
    }
}
