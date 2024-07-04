package L1_Patterns;

import java.util.Scanner;

public class alphaHillPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        for (int i = 0; i <rows; i++) {
            for (int k = i; k < rows - 1; k++) {
                System.out.print(" ");
            }
           int breakpoint = (2 * i+1)/2;
            char ch ='A';
            for (int j = 1; j <=2*i+1;j++) {
                System.out.print(ch);
                if (j<=breakpoint) {
                   ch++;
                }else {
                   ch--;
                }
            }

            System.out.println();
        }
    }
}
