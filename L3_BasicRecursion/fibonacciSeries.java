package L3_BasicRecursion;

import java.util.Scanner;

//Q8
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();         //taking input
        for (int i = 0; i <=num ; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int N){
        if(N <= 1){

            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibo(N-1);
        int slast = fibo(N-2);

        return last + slast;
    }
}
