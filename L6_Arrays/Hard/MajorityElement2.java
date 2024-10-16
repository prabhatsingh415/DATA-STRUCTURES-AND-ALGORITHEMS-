package L6_Arrays.Hard;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer i : Element(arr, n)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static List<Integer> Element(int []arr, int n){
        List<Integer>list = new ArrayList<>();
        int count1 = 0;
        int count2  =0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(count1 == 0 && arr[i] != el2){
                count1++;
                el1 = arr[i];
            } else if (count2 == 0 && arr[i] != el1) {
                count2++;
                el2 = arr[i];
            }else if (arr[i] == el1){
                count1++;
            } else if (arr[i] == el2) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count2 = 0;count1 = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] == el1){
                count1++;
            } else if (arr[i] == el2) {
                count2++;
            }
        }
        if (count1 > n/3) list.add(el1);
        if (count2 > n/3)list.add(el2);

        return list;

    }
}
