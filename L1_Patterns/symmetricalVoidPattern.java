package L1_Patterns;

import java.util.Scanner;

public class symmetricalVoidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();
        int space = 0;

        for (int i = rows; i >0; i--) {
           for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            for (int j = 0;j<space;j++) {
                System.out.print(" ");
            }
            for (int k = i; k >0 ; k--) {
                System.out.print("*");                           //for printing right sided numbers
            }
            space+=2;
            System.out.println();
        }
         space =2*rows-2;
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0;j< space;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");                           //for printing right sided numbers
            }
            space-=2;
            System.out.println();
        }
    }
}