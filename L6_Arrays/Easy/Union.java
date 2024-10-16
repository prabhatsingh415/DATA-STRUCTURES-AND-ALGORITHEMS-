package L6_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The First Array ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter The Size Of The second Array ");
        int s = sc.nextInt();
        int[] arr2 = new int[s];

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < s; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(union(arr1,arr2));
        sc.close();
    }
    public static List<Integer> union(int []arr1,int[]arr2){
        //Time Complexity = O(N1+N2);
        // Space Complexity = O(N1+N2);
        List <Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
         while (i<n1 && j<n2){
                if(arr1[i] <= arr2[j]){
                    if(list.isEmpty() ||list.getLast()!=arr1[i]){
                        list.add(arr1[i]);
                    }
                    i++;
                }else {
                    if(list.isEmpty() ||list.getLast()!=arr2[j]){
                        list.add(arr2[j]);
                    }
                    j++;
                }
         }
        while (i < n1) {
            if(list.isEmpty() ||list.getLast()!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while (j<n2){
            if(list.isEmpty() ||list.getLast()!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
}
