package L1_Patterns;

import java.util.Scanner;

public class alphaTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();
        char ch = (char) ('A'+(rows-1));

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }

    }
}
