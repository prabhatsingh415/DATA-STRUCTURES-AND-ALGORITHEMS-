package L6_Arrays.Medium;

import java.util.Collections;
import java.util.Scanner;

public class SetMatrixZeroes {
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
        zeros(matrix,n,m);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void zeros(int[][]matrix,int n ,int m ){
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                if(matrix[i][j] != 0){
                  if(matrix[i][0] == 0 || matrix[0][j] == 0){
                      matrix[i][j] = 0;
                  }
                }
            }
        }

        if(matrix[0][0] == 0){
            for (int j = 0; j < m ; j++) {
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i <n ; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
