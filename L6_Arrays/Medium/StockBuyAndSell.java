package L6_Arrays.Medium;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Profit(arr,n));
        sc.close();
    }
    public static int Profit(int []arr,int n){
        int maxProfit = 0;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            int cost = arr[i] - min;
            maxProfit = Math.max(maxProfit,cost);
            min = Math.min(min,arr[i]);
        }
        return maxProfit;
    }
}
