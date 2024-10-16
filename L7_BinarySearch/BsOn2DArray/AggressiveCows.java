package L7_BinarySearch.BsOn2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Number Of cows");
        int m = sc.nextInt();

        System.out.println(aggressiveCows(arr,m));

        sc.close();
    }
   public static int aggressiveCows(int []stalls, int k) {
        /*Time Complexity: O(NlogN) + O(N * log(max(stalls[])-min(stalls[]))),
        where N = size of the array, max(stalls[]) = maximum element in stalls[] array, min(stalls[]) = minimum element in stalls[] array.
        Reason: O(NlogN) for sorting the array. We are applying binary search on [1, max(stalls[])-min(stalls[])].
        Inside the loop, we are calling canWePlace() function for each distance,
        ‘mid’. Now, inside the canWePlace() function, we are using a loop that runs for N times.*/

        Arrays.sort(stalls);

        int low = 1;
        int high  = stalls[stalls.length-1] - stalls[0];

        while (low <= high) {

            int mid = (low + high) / 2;

            if(distance(stalls,mid,k)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean distance(int []arr,int mid,int k){
        int lastCow = arr[0];
        int cntCows = 1;


        for(int i = 1; i < arr.length ; i++){
            if((arr[i] - lastCow) >= mid){
                lastCow = arr[i];
                cntCows ++;
                if(cntCows >= k){
                    return true;
                }
            }
        }
        return false;
    }
}
