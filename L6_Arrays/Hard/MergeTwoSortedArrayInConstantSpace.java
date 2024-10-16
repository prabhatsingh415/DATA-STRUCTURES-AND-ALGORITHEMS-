package L6_Arrays.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrayInConstantSpace {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Size Of First Array");
        int n  = sc.nextInt();
        int [] arr1 = new int[n];
        System.out.println("Enter The Elements Of First Array");
        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the Size Of Second Array ");
        int m  = sc.nextInt();
        int [] arr2 = new int[m];
        System.out.println("Enter The Elements Of Second Array");
        for (int i = 0; i <m ; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr1[i]+" , ");
        }
        System.out.println();
        for (int i = 0; i <m ; i++) {
            System.out.print(arr2[i]+", ");
        }
    }
    public static void merge(int []a,int []b,int n){
        int left = 0;
        while(left<n){
            if(b[0]<a[left]){
                int temp = b[0];
                b[0] = a[left];
                a[left]  = temp;
                Arrays.sort(b);
            }else{
                left++;
            }
        }

    }
}
