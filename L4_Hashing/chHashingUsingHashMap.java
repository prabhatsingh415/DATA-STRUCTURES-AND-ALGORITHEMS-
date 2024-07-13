package L4_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Q4
public class chHashingUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String n = sc.nextLine();


        HashMap<Character,Integer> m  = new HashMap<>();
        for (int i = 0; i < n.length() ; i++) {
            char key =  n.charAt(i);
            int freq = 0;
            if (m.containsKey(key)) freq = m.get(key);
            freq++;
            m.put(key,freq);
        }
        // Iterate over the map:

        for (Map.Entry<Character, Integer> it : m.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        int q ;
        q = sc.nextInt();
        while (q-- > 0){
            char c;
            c = sc.next().charAt(0);
            if (m.containsKey(c)) System.out.println(m.get(c));
            else System.out.println(0);
        }
    }
}
