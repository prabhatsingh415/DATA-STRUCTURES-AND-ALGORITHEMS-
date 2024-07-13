package L3_BasicRecursion;

import java.util.Scanner;

//Q6
public class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int size = scan.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int n = 0;
        reverse(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void reverse(int []arr,int n){
        int length = arr.length;
           if (n >= length/2){
               return;
           }else {
               int temp = arr[n];
               arr[n] = arr[length-n-1];
               arr[length-n-1] = temp;

           }
           reverse(arr,n+1);
    }

}
