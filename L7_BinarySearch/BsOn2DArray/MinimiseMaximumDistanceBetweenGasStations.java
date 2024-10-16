package L7_BinarySearch.BsOn2DArray;

import java.util.Scanner;

public class MinimiseMaximumDistanceBetweenGasStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The number of gasStations");
        int  k = sc.nextInt();
        System.out.println(distance(arr,k));
    }
    private static double distance(int []arr,int n){
        double low = 0;
        double high = 0;
        for (int i = 0; i < n-1 ; i++) {
            high  = Math.max(high,arr[i+1]-arr[i]);
        }
        double diff = 1e-6; // 1e-6 is the scientific notation for 1 × 10^−6.
         while (high - low > diff){
             double mid = (low + high) / 2.0;
             if(noOfGasStations(arr,mid) > 4){
                 low = mid;
             }else{
                 high = mid;
             }
         }
        return high;
    }
    private static int noOfGasStations(int []arr,double distance){
        int cnt = 0 ;
          for(int i = 0;i<arr.length-1;i++){
            int noInBetween  = (int) ((arr[i+1] - arr[i])/distance);
            if((arr[i+1] - arr[i]) == distance * noInBetween){
                noInBetween--;
            }
            cnt += noInBetween;
        }
          return cnt;
    }

}
