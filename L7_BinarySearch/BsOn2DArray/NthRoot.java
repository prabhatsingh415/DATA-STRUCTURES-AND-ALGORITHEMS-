package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class NthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num = sc.nextInt();
        System.out.println("Enter The Value of n");
        int n = sc.nextInt();
        System.out.println(search(num,n));
        sc.close();
    }
    private static int search(int num,int n){
        int low  = 1;
        int high = num;
        while (low<=high){
            int mid = (low +high)/2;
            if(Math.pow(mid,n) == num){
                return mid;

            } else if ( Math.pow(mid,n)> num) {
                high  = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
