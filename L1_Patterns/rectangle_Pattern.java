package L1_Patterns;

import java.util.Scanner;

public class rectangle_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int j = 0; j <rows; j++) {
            for (int i = 0; i <rows; i++) {
                System.out.print(" * ");           // Inner Loop Printing The Pattern
            }
            System.out.println();             // Gives New Line After Every Iteration
        }

    }
}
