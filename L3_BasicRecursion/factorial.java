package L3_BasicRecursion;
//Q5
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();         //taking input
        System.out.println("The Factorial Is "+fact(num));        //printing result
    }
    public static int fact(int n){
        if(n == 1){
            return 1;               // Base Condition
        }
     return    fact(n-1)*n;        //Calculating Factorial
    }
}
