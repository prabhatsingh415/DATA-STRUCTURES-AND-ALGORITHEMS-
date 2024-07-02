package L1_Patterns;

import java.util.Scanner;

public class reverseLeftHalfTrinagle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows And Columns");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int j = 1;j<=rows ;j++)   {
            for (int i = 1; i <=rows ; i++) {
                System.out.print(" "+i +" ");             // Loop Printing Star Pattern


            }
            System.out.println();                        // Gives New Line After Every Iteration

        }
    }
}
