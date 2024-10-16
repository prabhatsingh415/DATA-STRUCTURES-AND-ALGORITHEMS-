package L6_Arrays.Medium;
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements Of array");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> A = new ArrayList<>();
        for (int element : arr) {
            A.add(element); // Autoboxing from int to Integer
        }
        List<Integer> ans = nextGreaterPermutation(A,n);

        System.out.print("The next permutation is: [");
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println("]");
    }
    public static List<Integer>nextGreaterPermutation(List<Integer>list,int n){
        int breakPoint = -1;
        for (int i = n-2; i >=0 ; i--) {
            if(list.get(i)<list.get(i+1)){
               breakPoint = i;
               break;
            }
        }
        if(breakPoint == -1){
            Collections.reverse(list);
            return list;
        }
        for (int i = n-1; i >breakPoint ; i--) {
            if(list.get(i)>list.get(breakPoint)){
                int temp = list.get(i);
                list.set(i, list.get(breakPoint));
                list.set(breakPoint, temp);
                break;
            }
        }
        Collections.reverse(list.subList(breakPoint+1,n));
        return list;
    }
}
