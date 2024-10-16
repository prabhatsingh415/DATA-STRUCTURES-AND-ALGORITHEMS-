package L6_Arrays.Easy;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        move(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
        public static void move(int []arr){
        /*
        Time Complexity = O(2N)
         Space Complexity = O(N)
            List<Integer>list = new ArrayList<>();
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i]!=0){
                    list.add(arr[i]);

                }
            }
            for (int i = 0; i <list.size() ; i++) {
                arr[i] = list.get(i);
            }
            for (int i = list.size(); i <arr.length ; i++) {
                arr[i]=0;
            }*/

//            Optimal Solution
//            Time Complexity  = O(N)
//            Space Complexity = O(1)

                int j  = -1;

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] == 0){
                    j = i;
                    break;
                }
            }
            if(j == -1)return;
            for (int k = j+1; k < arr.length  ; k++) {
                if (arr[k] != 0){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
    }

}

