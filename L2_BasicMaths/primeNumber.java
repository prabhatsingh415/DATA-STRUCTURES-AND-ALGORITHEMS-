package L2_BasicMaths;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if  (prime(num)==2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static int prime(int num) {
        int count = 0;
        for (int i = 1; i*i<=num; i++) {
            if (num % i == 0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
        }
        return count;
    }
}
