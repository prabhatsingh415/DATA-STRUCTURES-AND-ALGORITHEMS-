package L2_BasicMaths;

import java.util.Scanner;

public class reverseANumber {

    public static int reverse(int num){              //Function For Counting Digits
        int newNum = 0;
        while (num>0){
           int lastDigit = num %10;
            num/=10;                              //Finding Reverse
            newNum = (newNum*10)+lastDigit;
        }
        return newNum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();            //Taking Input From User;
        System.out.println( "The Reverse Of Number Is "+reverse(num));         //Printing Result
    }
}
