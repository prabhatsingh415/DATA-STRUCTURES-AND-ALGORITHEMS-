package L6_Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Number You Want To Find");
        int num = sc.nextInt();
        if (search(arr,num) == - 1){
            System.out.println("Element Is Not Present In Array");
        }else {
            System.out.println( "The Number Is At Index "+search(arr,num)+".");
        }

        sc.close();
    }
    public static int search(int []arr,int num){
        //Optimal solution
        //Time Complexity O(N)
        //Space Complexity O(1)
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == num){
                return i;
            }
        }

        return -1;
    }
}
