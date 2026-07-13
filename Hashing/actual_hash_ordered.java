package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class actual_hash_ordered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> mpp  = new HashMap<>();

        for(int i = 0; i<n ; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0){
            int number;
            number = sc.nextInt();

            System.out.println(mpp.get(number));
        }
    }
}
