package L7_BinarySearch.BsOnAnswers;
import java.util.Scanner;

public class FindPeakElementIn2DMatrix {
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
        for (int i : findPeakGrid(matrix)) {
            System.out.println(i);
        }
    }
    public static int[] findPeakGrid(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int  low = 0;
        int high = m-1;

        while (low <= high){
            int mid = (low + high) / 2;
            int row = row(matrix,mid,n);

            int left = mid - 1 >= 0 ? matrix[row][mid - 1] : -1 ;
            int right = mid + 1 < m ? matrix[row][mid + 1] : -1 ;

            if(matrix[row][mid] > left && matrix[row][mid] > right){
                return  new int[] {row , mid};
            }else if(matrix[row][mid] < left){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return new int[]{-1,-1};
    }
    private static int row(int [][]arr,int col , int n){
        int max = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i][col] > max){
                max  = arr[i][col];
                index = i;
            }
        }
        return index;
    }

}

