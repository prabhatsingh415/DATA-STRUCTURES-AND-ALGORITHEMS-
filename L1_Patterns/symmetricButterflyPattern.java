package L1_Patterns;

import java.util.Scanner;

public class symmetricButterflyPattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        int space = 2*rows-2;
            for (int i = 1; i <=rows ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--) {
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        space = 2;
        for (int i = 1; i <=(rows-1) ; i++) {
            for (int j = rows-i; j >0 ; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for(int k = rows-i; k > 0; k--) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }

    }
}
