package L3_BasicRecursion;
//Q4
import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();         //taking input

        System.out.println("Sum Is --> "+printSum(num));  // function call
    }

    public static int printSum(int N){
        if (N<=0){
            return 0;          //Base Condition
        }
        return printSum(N-1)+N;          //Calculating Sum
    }
}
