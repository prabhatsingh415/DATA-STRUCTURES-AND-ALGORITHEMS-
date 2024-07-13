package L4_Hashing;

import java.util.Scanner;
//Q2
public class characterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String Of Lower Case Letters");
        String A = sc.nextLine();

        int []hash  = new int [256];   //If we don't know whether the string contains lowercase or uppercase characters,
                                      // we can use a size of 256 for the hash array to accommodate
                                     //all possible ASCII characters.
        for (int i = 0; i <A.length(); i++) {       // for lower case letter use String.charAt(i) - 'a'.
            hash[A.charAt(i)]++;                   //indexing
        }                                       // for upper case letter use String.charAt(i) - 'A'.

        System.out.println("Enter Number Of queries");
        int q = sc.nextInt();
        while (q-- !=0){
            char C;
            C  = sc.next().charAt(0);        //Taking Character
            //fetching
            System.out.println(hash[C]);
        }

    }
}
