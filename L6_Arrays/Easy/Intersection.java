package L6_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intersection {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Size Of The First Array ");
            int n = sc.nextInt();

            int[] arr1 = new int[n];
            System.out.println("Enter the elements of first the array: ");
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter The Size Of The First Array ");
            int s = sc.nextInt();
            int[] arr2 = new int[s];
            System.out.println("Enter the elements of the second array: ");
            for (int i = 0; i < s; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println(intersection(arr1,arr2));
            sc.close();
        }
        public static List<Integer> intersection(int []arr1, int[]arr2){
            //Time Complexity = O(n + m);
            //Space Complexity = O(1) or O(min(n,m))

            List <Integer> list = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i<arr1.length && j<arr2.length ){
                   if (arr1[i]<arr2[j]){
                       i++;
                   } else if (arr2[j]<arr1[i]) {
                       j++;
                   }
                   else {
                       list.add(arr1[i]);
                       i++;
                       j++;
                   }
            }
            return list;
        }

}
