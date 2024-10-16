package L6_Arrays.Hard;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class FindDuplicatesAndMissingElements {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int n  = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer i : Find(arr, n)) {
            System.out.println(i);
        }
    }
    public static int [] Find(int []nums, int l){

      // Optimal solution
      //Time complexity = O(N)
      //Space Complexity = O(1)
        long n = l;
        long SumOfN = (n*(n+1))/2; // Sum Of All Integers Till N
        long SumOfN2 = (n*(n+1)*(2*n+1))/6; // Sum Of Square Of All Integers Till N
        long SumOfArr = 0;
        long SumOfArr2 = 0;
        for(int i = 0;i<n;i++){
            SumOfArr += nums[i];      // Sum Of Elements Of Array
            SumOfArr2 += (long)nums[i]*(long)nums[i]; // Sum Of Square Of Elements Of Array
        }
        long val1 = SumOfArr-SumOfN; // X-Y
        long val2 =   SumOfArr2 - SumOfN2 ; // X square + Y square
        val2 = val2/val1; //  now Val2 Become X+Y
        long x = (val1+val2)/2; // Solving Equation x-y = value1 And x+y = value2
                               // solving Them We Get 2X = New Value
                              // Then X = Value/2 ---> Here Value = val1+val2
        long y = x-val1  ;   // Simple put The Value Of X int x - y = val1
        return new int []{(int)x,(int)y};
        // Time Complexity = O(N Log N)
        //Space Complexity = O(1)
//        List<Integer>list = new ArrayList<>();
//        if(arr[arr.length-1] != arr.length){
//            list.add(n);
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i <n-1 ; i++) {
//            if(arr[i] == arr[i+1]){
//                list.add(arr[i]);
//                break;
//            }
//            int next = arr[i]+1;
//            if(arr[i+1] != next){
//                list.add(next);
//            }
//        }
//
//        return list;
    }
}
