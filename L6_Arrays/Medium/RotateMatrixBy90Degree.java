package L6_Arrays.Medium;

import java.util.Scanner;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers Of rows of  Matrix");
        int n  = sc.nextInt();
        System.out.println("Enter numbers Of Columns of  Matrix");
        int m  = sc.nextInt();
        int [][]matrix = new int[n][m];
        System.out.println("Enter The Elements :----");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println("Enter The "+i+" "+ j+"th Element");
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate(matrix,n,m);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotate(int [][]matrix,int n , int m){
        for(int i = 0;i<n;i++){
            for (int j = 0; j <m ; j++) {
                if(i ==j){
                    break;
                }else{
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < n/2; j++) {
             int temp = matrix[i][j];
             matrix[i][j] = matrix[i][matrix.length-1-j];
             matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
