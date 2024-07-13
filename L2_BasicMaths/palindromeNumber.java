package L2_BasicMaths;

import java.util.Scanner;

public class palindromeNumber {
    public static void palindrome(int n){//Function For Checking Is Palindrome Or Not
        int reverse = 0;
        int dup = n;           // duplicate number To Store The Value Of Number
                             // Because Value Of Dup Will Change After Performing Operations On Dup.
        while (dup > 0) {
            int lastDigit = dup % 10;
            reverse = (reverse * 10) + lastDigit;
            dup /= 10;                                        //Finding Reverse Of Number

        }
        if ( n == reverse){                                   //Comparing Number With Reverse
            System.out.println("Number Is Palindrome");
        }else{
            System.out.println("Number Is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();//Taking Input From User;

         palindrome(num);        //Function Call
    }
}
