package L4_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Q3
public class noHashingUsingHashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (map.containsKey(key)) freq = map.get(key); //fetching from map
                freq++;
                map.put(key, freq);
        }
        // Iterate over the map:

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (map.containsKey(number)) System.out.println(map.get(number));
            else System.out.println(0);
        }
    }
}
