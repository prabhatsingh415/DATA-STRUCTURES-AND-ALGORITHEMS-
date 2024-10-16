package L7_BinarySearch.BsOn1DArray;
import java.util.Scanner;

public class FindXInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter The Element Of The Array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched in the array.");
        int target = sc.nextInt();
        System.out.println("The given number is found at "+binarySearch(arr,0,n-1,target)+" index");
        sc.close();
    }
    private static int binarySearch(int []arr,int low,int high,int x){
        if(low>high)return -1;
        int mid = (low + high)/2;
        if(x == arr[mid])return mid;
        else if(x > arr[mid]) return binarySearch(arr,mid+1,high,x);
        else return binarySearch(arr,low,mid-1,x);
    }
}
