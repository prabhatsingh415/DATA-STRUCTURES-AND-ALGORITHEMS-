package L1_Patterns;

import java.util.Scanner;

public class leftSideTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows  ");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int j = 0; j <rows ; j++) {

            for (int i = 0; i <j+1 ; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int j = rows; j >0 ; j--) {

            for (int i = j-1; i >0 ; i--) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
