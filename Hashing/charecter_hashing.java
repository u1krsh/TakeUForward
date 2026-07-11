package Hashing;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class charecter_hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        s = sc.nextLine();

        int[] hash = new int[26];
        Arrays.fill(hash, 0);

        for(int i = 0; i < s.length();i++){
            hash[s.charAt(i) - 'a']++ ;
        }

        int q ;
        q = sc.nextInt();

        while(q-- > 0){
            char c;
            c = sc.next().charAt(0);

            System.out.println(hash[c-'a']);
        }


    }
}
