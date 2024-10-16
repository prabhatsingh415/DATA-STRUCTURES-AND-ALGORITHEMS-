package L6_Arrays.Easy;

import java.util.Scanner;

//Q3
public class CheckArrayIsSorted {
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
       if (check(arr)){
           System.out.println("Array Is Sorted");
       }else {
           System.out.println("Array Is Not Sorted");
       }
    }
    public static boolean check(int []arr){
        if(arr.length == 1 ){
            return true;
        }
        for (int i = 1; i <arr.length-1 ; i++) {
            if (arr[i]>=arr[i- 1]) {

            }else {
                return false;
            }
        }
        return false;
    }
}
