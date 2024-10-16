package L7_BinarySearch.BsOnAnswers;

import java.util.Scanner;

public class MatrixMedian {
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
        System.out.println("The median of matrix is "+median(matrix,n,m));
    }
    private static int median(int [][]matrix, int n , int m ){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        // point low and high to right elements
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }
        int req = (n * m) / 2;
        while (low <= high){
            int mid = (low + high) / 2;
            int smallElements = small(matrix,n,m,mid);
            if(smallElements <= req){
                low = mid + 1;
            }else{
                high  = mid - 1;
            }
        }
        return low;
    }
    private static int small(int [][]matrix,int n,int m,int mid){
        int cnt = 0;
        for (int i = 0; i < n ; i++) {
        cnt += upperBound(matrix[i],m,mid);
         }
        return cnt;
    }
    private static int upperBound(int []matrix,int m,int target){
     int value = m;
     int low = 0;
     int high = m - 1;
   while (low<=high){
       int mid = (low + high)/2;
       if(matrix[mid] > target){
          value = mid;
          high =  mid - 1;
       }else {
           low = mid + 1;
       }
   }
   return value;
    }
}
