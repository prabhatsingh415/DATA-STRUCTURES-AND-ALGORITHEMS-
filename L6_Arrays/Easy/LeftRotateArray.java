package L6_Arrays.Easy;

import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,n);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
    public static void rotate(int []arr,int n){
          int firstIndex = arr[0];
      //Time Complexity = O(N) And Space Complexity = O(1);
        for (int i = 1; i <n ; i++) {
          arr[i-1] = arr[i];
        }
        arr[n-1] = firstIndex;
    }
}
