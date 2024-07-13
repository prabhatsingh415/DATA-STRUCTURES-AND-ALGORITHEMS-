package L3_BasicRecursion;
//Q3
import java.util.Scanner;

public class printNTo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Number");
        int num  = scan.nextInt();        //taking input

        printNum(num);       // function call
    }
    public static void printNum(int n){     //function
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);            //recursive call
    }
}

