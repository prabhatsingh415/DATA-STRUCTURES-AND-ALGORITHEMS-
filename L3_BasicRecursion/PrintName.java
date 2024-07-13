package L3_BasicRecursion;

import java.util.Scanner;

//Q2
public class PrintName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter How Many Time You Want To Print the Name");
        int num  = scan.nextInt();

        scan.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter The Name");
        String name = scan.nextLine();
        printName(num,name);
    }
    public static void printName(int n,String name){                //function for printing name
        if (n <=0){
            return;
        }
        printName(n-1,name);                    //recursive call
        System.out.println(name+" ");
    }
}
