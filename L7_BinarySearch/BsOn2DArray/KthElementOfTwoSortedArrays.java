package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of The Array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of The Array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter The Number To be Found");
        int st = sc.nextInt();
        System.out.println(kthElement(arr1,arr2,st));
        sc.close();
    }

public static int kthElement(int[] a, int[] b,int k) {
    // Size of two given arrays
    int n1 = a.length;
    int n2 = b.length;
    if(n1 > n2) return kthElement(b,a,k);

    int  low = Math.max(0,k-n2);
    int  high = Math.min(k,n1);
    int n = n1 + n2;


    while(low <= high){
        int mid1 = (low + high) / 2;
        int mid2 = k - mid1;

        int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
        int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
        int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
        int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

        if(l1 <= r2 && l2 <= r1){
            return Math.max(l1,l2);
        }else if(l1 > r2){
            high = mid1 - 1;
        }else{
            low = mid1 + 1;
        }

    }
    return  0;
}

}
