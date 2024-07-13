package L2_BasicMaths;

import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(checkGcd(num1,num2));
    }
    public static int checkGcd(int n1,int n2){
       while(n1>0 && n2>0){
           if (n1>n2){
               n1 = n1%n2;
           }else {
               n2 = n2%n1;
           }
       }
       if (n1 == 0){
           return n2;
       }else {
           return n1;
       }
    }
}
