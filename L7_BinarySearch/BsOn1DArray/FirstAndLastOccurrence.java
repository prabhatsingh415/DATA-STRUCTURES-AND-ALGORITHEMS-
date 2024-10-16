package L7_BinarySearch.BsOn1DArray;

import java.util.Scanner;

public class FirstAndLastOccurrence {
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
        for (int i : searchRange(arr, target)) {
            System.out.println(i);
        }
        sc.close();
    }
    public static int[] searchRange(int[] numbs, int target) {
        int n = numbs.length;
        int ans = -1;
        int first  = first(numbs,target,0,n-1,ans);
        if(first  == -1)return new int []{-1,-1};
        int second = second(numbs,target,0,n-1,ans);
        return new int [] {first , second};
    }
    private static int first(int []arr,int x,int low,int high,int first){// For first Occurrence We Can Also use lowerBound
        if(low>high)return first;
        int mid = (low + high)/2;
        if(x == arr[mid]){
            first =  mid ;
            return first(arr,x,low,mid-1,first);
        }
        else if(x > arr[mid]) return first(arr,x,mid+1,high,first);
        else return first(arr,x,low,mid-1,first);

    }
    private static int second(int []arr,int x,int low,int high,int last){ // For Last Occurrence We Can Also use upperbound
        if(low>high)return last;
        int mid = (low + high)/2;
        if(x == arr[mid]){
            last = mid ;
            return  second(arr,x,mid+1,high,last);
        }
        else if(x > arr[mid]) return  second(arr,x,mid+1,high,last);
        else return  second(arr,x,low,mid-1,last);

    }
}
