package L6_Arrays.Hard;


import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers Of rows of  Matrix");
        int n = sc.nextInt();
        System.out.println("Enter numbers Of Columns of  Matrix");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter The Elements :----");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter The " + i + " " + j + "th Element");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (List<Integer> i : merge(matrix, n)) {
            System.out.println(i);
        }

    }
        public static List<List<Integer>> merge(int[][] arr, int n){
             List<List<Integer>>list = new ArrayList<>();
            Arrays.sort(arr, (a, b) -> a[0] - b[0]);
            for (int i= 0; i < n; i++) {
                if(list.isEmpty() || arr[i][0] > list.get(list.size()-1).get(1)){
                    list.add(Arrays.asList(arr[i][0], arr[i][1]));
                }else{
                    list.get(list.size()-1).set(1,Math.max(list.get(list.size()-1).get(1),arr[i][1]));
                }
            }
            return list;
        }

}
