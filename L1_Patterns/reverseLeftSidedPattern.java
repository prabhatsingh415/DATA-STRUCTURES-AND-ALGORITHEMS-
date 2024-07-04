package L1_Patterns;

import java.util.Scanner;

public class reverseLeftSidedPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = rows; i >=1 ; i--) {
            for (int j = i;j>=1 ;j--) {
                 System.out.print(" * ");                // Loop Printing Star Pattern
            }
            System.out.println();                        // Gives New Line After Every Iteration
        }
    }
}
