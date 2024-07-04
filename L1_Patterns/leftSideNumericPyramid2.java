package L1_Patterns;

import java.util.Scanner;

public class leftSideNumericPyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = 1; i <= rows; i++) {
            System.out.println();                                           // Gives New Line After Every Iteration
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i+" ");                           // Loop Printing Star Pattern
            }

        }
    }
}
