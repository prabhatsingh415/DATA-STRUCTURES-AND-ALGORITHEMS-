package L7_BinarySearch.BsOnAnswers;

import java.util.Scanner;

public class RowWithMaximumNumberOf1s {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows");
        int n = sc.nextInt();
        System.out.println("Enter The Number Of Columns");
        int m = sc.nextInt();
        int [][]matrix = new int [n][m];
        System.out.println("enter The Elements");
        for (int i = 0; i< n; i++){
            for (int j = 0; j <m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s( matrix));
    }
    public static int rowWithMax1s(int [][]arr) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int max = 0;
        int index = -1;
        // traverse the matrix:
        for (int i = 0; i < n; i++) {
            int cntOnes = m - lowerBound(arr[i],m);
            if (cntOnes > max) {
                max = cntOnes;
                index  = i;
            }
        }
        return index;

    }
    private static int lowerBound(int []arr,int m){
        int low = 0;
        int high = m-1;
        int ans  = m;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= 1){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
