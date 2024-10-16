package L6_Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMatrixInSpiralManner {
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
        for (Integer i : print(matrix, n, m)) {
            System.out.println(i);
        }
    }
    public static List<Integer>print(int [][]matrix,int n,int m){
        List<Integer>list = new ArrayList<>();
        int left = 0;int top = 0;
        int right = m-1;int bottom  = n-1;
        while(top<=bottom && left<=right){
            for (int i = left; i <=right ; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom ){
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][bottom]);
                }
                left++;
            }
        }
        return list;
    }
}
