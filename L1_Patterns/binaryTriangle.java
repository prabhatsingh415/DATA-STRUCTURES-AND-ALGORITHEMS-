package L1_Patterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Number Of Rows");
        int rows = scan.nextInt();

        for (int i = 0; i <rows ; i++) {

           int start;

           if(i%2 == 0) {
               start = 1;
           }else{
               start = 0;
           }


            for (int j = 0; j <=i ; j++) {
                System.out.print(start);
                start = 1-start;

            }
            System.out.println();
        }

        }

}
