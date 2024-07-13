package L3_BasicRecursion;

import java.util.Scanner;

//Q7
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String word = sc.nextLine();
        if(palindrome(word,0)){
            System.out.println("String Is Palindrome");
        }else {
            System.out.println("String Is Not Palindrome");
        }
    }
    public static boolean palindrome(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return palindrome(s,i+1);
    }

}
