package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class SquareRootOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int n = sc.nextInt();
        System.out.println("The Square root is " + search(n));
        sc.close();
    }
    private static int search(int n){
        int low  = 1;
        int high = n;
        int ans  = 0;
        while (low<=high){
            int mid = (low +high)/2;
            if(mid * mid <= n){
                ans = mid;
                low = mid + 1;
            } else if (mid*mid > n) {
                high  = mid - 1;
            }
        }
        return ans;
    }
}
