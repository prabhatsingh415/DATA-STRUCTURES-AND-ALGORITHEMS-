package L6_Arrays.Easy;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();

        if (n<=0){
            System.out.println("Array size cannot be zero");
            return;
        }

        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number Of Unique Elements Is "+DuplicateCheck(arr));
        System.out.println("now array is");
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int DuplicateCheck(int[]arr){
        // Time Complexity = O(N) And Space Complexity O(1)
      int i = 0;
        for (int j = 0; j <arr.length ; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
