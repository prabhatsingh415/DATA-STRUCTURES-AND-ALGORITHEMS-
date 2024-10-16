package L7_BinarySearch.BsOnAnswers;

import java.util.Scanner;

public class SearchInARowAndColumnWiseSortedMatrix {
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
        System.out.println("Enter The Target ");
        int target = sc.nextInt();
        System.out.println(searchMatrix(matrix,target,n,m));
    }
    private static boolean searchMatrix(int [][] matrix, int target,int n,int m){
        int low = 0;
        int high = (n * m) - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return false;
    }
}
