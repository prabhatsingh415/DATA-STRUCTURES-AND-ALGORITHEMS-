package L1_Patterns;

import java.util.Scanner;

public class leftSideNumericPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = 0; i < rows; i++) {
            System.out.println();                                           // Gives New Line After Every Iteration
            for (int j = 1; j <= i+1; j++) {
                System.out.print(" "+j+" ");                           // Loop Printing Star Pattern
            }

        }
    }
}
