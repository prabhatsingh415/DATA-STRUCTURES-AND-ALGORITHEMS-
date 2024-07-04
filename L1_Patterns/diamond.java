package L1_Patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows  ");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = 0; i < rows ; i++) {
            for (int j = i; j < (rows-1) ; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (i*2+1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int l = rows; l >=0 ; l--) {
            for (int m = 0; m <(rows-l); m++) {
                System.out.print("  ");
            }
            for (int n = ((l-1)*2+1); n > 0; n--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
