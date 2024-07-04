package L1_Patterns;

import java.util.Scanner;

public class increasingNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();
        int k = 0 ;
        for (int i = 0; i <rows; i++) {

            for (int j = 0; j <=i ; j++) {

                k++;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
