package L1_Patterns;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows  ");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = rows; i >0 ; i--) {
            for (int j = 0; j <(rows -i); j++) {
                System.out.print("   ");                         // gives blank space on left side
            }
            for (int k = ((i-1)*2+1); k >0 ; k--) {
                System.out.print(" * ");                            // prints pattern
            }
            System.out.println();                          // for a new line
        }
    }
}
