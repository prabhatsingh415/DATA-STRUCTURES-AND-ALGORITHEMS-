package L1_Patterns;

import java.util.Scanner;

public class reverseLetterTriangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        for (int i = 0; i <rows ; i++) {
            for (char ch = 'A'; ch <'A'+(rows-i);ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
