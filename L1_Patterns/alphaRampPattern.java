package L1_Patterns;

import java.util.Scanner;

public class alphaRampPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();
        char letter = 65;             // ASCII Value Of A
        for (int i = 0; i <rows ; i++) {     // Outer Loop For Rows

            for (int j = 0;j<=i;j++) {
                System.out.print(letter);         // Printing Letters
            }
            letter++;                //incrementing The Value Letter
                                    /*
                                    letter++ will increment the value from 65 to 66 to 67, and so on,
                                    until the loop runs. The char letter will convert the int value into a char value.
                                     */
            System.out.println();
        }
    }
}
