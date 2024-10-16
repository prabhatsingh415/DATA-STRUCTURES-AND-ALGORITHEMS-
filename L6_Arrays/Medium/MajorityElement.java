package L6_Arrays.Medium;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Element(arr,n));
        sc.close();
    }
    public static int Element(int []arr, int n){
        int count = 0;
        int el = 0;
        for (int i = 0; i <n ; i++) {
            if(count == 0){
                count = 1;
                el = arr[i];
            }else if (el == arr[i] ){
                count++;
            }else{
                count--;
            }
        }
        //We don't have to use the Last loop if the array must have a majority element
        int count1 = 0;
        for (int k = 0; k <n ; k++) {
            if(arr[k] == el) {
                count1++;
            }
        }
        if (count1 > (n/2)){
            return el;
      }
        return -1;
}
}
