package L1_Patterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Numbers  Of Rows  ");
        int rows = scan.nextInt();               // Taking Numbers Of Rows As Input

        for (int i = 0; i < rows; i++) {
            for (int j = i; j <(rows-1) ; j++) {
                System.out.print("  ");
            }
            int k = 0;
            do {
                System.out.print(" *");
                k++;
            }while ( k <i*2+1);
            System.out.println();
            }

        }

    }

