package L4_Hashing;
import java.util.Scanner;
//Q5
public class highestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();

        int maxArr = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (maxArr<arr[i]){
                maxArr =arr[i];      //Finding Max Element Of Array
            }
        }
        //precompute:
        int[] hash = new int[maxArr+1];        // Creating Hash Array Of (Max Element + 1) Size
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int large = hash[0];
        int max = 0;
        for (int i = 0; i <hash.length ; i++) {
            if (large<hash[i]){                       //Counting Maximum Frequency
                large = hash[i];
                max = i;
            }
        }

        int small = Integer.MAX_VALUE;
        int min = 0;
        for (int i = 0; i < hash.length ; i++) {         // Counting Minimum Frequency
            if (hash[i] != 0 && hash[i]<small){
                small = hash[i];
                min =i;
            }
        }
        System.out.println("The Element With Highest Frequency Is "+max);
        System.out.println("The Element With Lowest Frequency Is "+min);
    }
}
