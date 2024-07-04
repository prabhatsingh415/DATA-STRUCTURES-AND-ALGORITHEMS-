package L1_Patterns;

import java.util.Scanner;


public class numberCrownTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

           int space = 2*(rows-1);                   //for counting spaces

        for (int i = 1; i <=rows ; i++) {        //outer loop for rows

                  for(int j = 0; j < i ; j++) {               // for printing left sided numbers
                     System.out.print(j+1);
                  }

                  for (int k = 0;k <=(space-(i*2))+1; k++) {         // for printing spaces
                  System.out.print(" ");
                  }

                  for (int k = i; k >0 ; k--) {
                  System.out.print(k);                           //for printing right sided numbers
                  }

                  System.out.println();                       //for a new line
            }

     }
}

