package L6_Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The PascalTriangle");
         int n = sc.nextInt();
        for (List<Integer> integers : generate(n)) {
            System.out.println(integers);
        }
        sc.close();
    }
    private  static List<List<Integer>> generate(int n){
        List<List<Integer>>list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            list.add(row(i));
        }
        return list;
    }
    private static List<Integer> row(int n){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for(int i = 1;i<n;i++){
            ans*=n-i;
            ans/=i;
            list.add(ans);
        }
        return list;
    }
}
