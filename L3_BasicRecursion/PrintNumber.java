package L3_BasicRecursion;

import java.util.Scanner;
 //Q1
public class PrintNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();            //taking input
        printNos(10);        // function call
    }
    public static void printNos(int N) {        // function
         if (N < 0){
            return;
        }

        printNos(N-1);              //recursive call
        System.out.print(N+" ");                //printing Number
    }
}
