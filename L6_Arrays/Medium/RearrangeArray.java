package L6_Arrays.Medium;

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("New Array Is :-");
        for (int i : Rearrange(arr, n)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static int[] Rearrange(int []arr,int n){
        int [] ans  = new int[n];
        int pos  = 0;
        int neg  = 1;
        for (int i = 0; i <n ; i++) {
            if (arr[i] < 0){
                ans[neg] = arr[i];
                neg+=2;

            }else {
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }
}
