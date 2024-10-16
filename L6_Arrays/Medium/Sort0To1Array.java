package L6_Arrays.Medium;

import java.util.Scanner;

public class Sort0To1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter The Elements Of Array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Sorted Array Is ");
        sort(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static void sort(int []arr,int n){
        int low  = 0;
        int mid  = 0;
        int high  = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
