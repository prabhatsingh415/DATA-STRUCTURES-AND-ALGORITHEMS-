package L1_Patterns;

import java.util.Scanner;

public class hollowRectanglePattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        for (int i = 0; i <rows ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j < rows-2; j++) {
            for (int k = 0; k <1 ; k++) {
                System.out.print("*");
            }
            for (int l = 0; l <rows-2 ; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m <1 ; m++) {
                System.out.println("*");
            }
        }
        for (int n = 0; n <rows ; n++) {
            System.out.print("*");
        }

    }
}
