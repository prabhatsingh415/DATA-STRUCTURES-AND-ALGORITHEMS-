package L6_Arrays.Easy;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The First Array ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the elements of first the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(max(arr1,n));
        sc.close();
    }
    public static int max(int []arr,int n){
        //Optimal Approach :-
        //Time Complexity  = O(N)
        //Space Complexity = O(1)
        int count = 0, max = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] == 1){
                count++;
            }else {
                count = 0;
            }
            if(count > max){
                max = count ;
            }
        }
        return max;
    }
}
