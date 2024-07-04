package L1_Patterns;

import java.util.Scanner;

public class letterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        for (int i = 0; i <rows ; i++) {
            for (char ch  = 'A';ch<='A'+i;ch++) {      // Every Iteration Switch To Next Letter
                 System.out.print(ch+" ");            // Printing Letter
            }
            System.out.println();               // Printing Next Line
        }
    }
}
