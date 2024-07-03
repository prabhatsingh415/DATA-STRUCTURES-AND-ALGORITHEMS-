package L1_Patterns;

import java.util.Scanner;

public class reverseLeftHalfNumericTriangle{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int j = 5;j>=1 ;j--)   {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" "+i +" ");             // Loop Printing Star Pattern

            }
            System.out.println();                        // Gives New Line After Every Iteration

        }
    }
}

