package L2_BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class printAllDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        divisors(num);
    }
    public static void divisors(int num){
        List<Integer>list = new ArrayList<>();
        System.out.println("The Divisors Of "+num+" Are ");
        for (int i = 1; i <= Math.sqrt(num) ; i++) {
            if (num%i == 0){
                list.add(i);
               if ((num/i )!=i){
                   list.add(num/i);
                   System.out.println("h"+num/i);
               }
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
