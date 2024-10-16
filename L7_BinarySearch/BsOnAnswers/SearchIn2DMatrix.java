package L7_BinarySearch.BsOnAnswers;

import java.util.Scanner;

public class SearchIn2DMatrix {
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
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        // traverse the matrix:
        for (int[] i : matrix) {
            int n = i.length;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (i[mid] == target) {
                    return true;
                } else if (i[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
