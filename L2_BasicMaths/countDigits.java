package L2_BasicMaths;

import java.util.Scanner;



public class countDigits {

    public static int countDigit(int N) {        //Function For Counting Digits
         int digits = 0;
        while (N > 0) {
            N /= 10;
            digits++;
        }
        return digits;
        }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();            //Taking Input From User

            System.out.println("There Are "+countDigit(num)+" Digits In This Number "); //Printing Result
        }
    }

