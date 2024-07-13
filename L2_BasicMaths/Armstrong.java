package L2_BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public static int count(int num){
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }



    public static int armstrong(int num , int power){
        int lastDigit;
        int sum = 0;

        int orignalNum = num;

        while (num>0){
            lastDigit = num%10;

            sum+=(int)Math.pow(lastDigit,power);

            num/=10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
        if (num == armstrong(num,count(num))){
            System.out.println("Number Is ArmStrong");
        }else{
            System.out.println("Number Is Not ArmStrong");
        }
    }
}
