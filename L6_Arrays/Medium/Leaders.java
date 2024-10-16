package L6_Arrays.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SuperiorElement(arr,n));
        sc.close();
    }
    public static ArrayList<Integer> SuperiorElement(int []arr,int n){
       ArrayList<Integer>list = new ArrayList<>();
        int max  = arr[n-1];
        list.add(arr[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]>max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list;
    }
}
