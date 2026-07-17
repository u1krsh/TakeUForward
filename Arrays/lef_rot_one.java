package Arrays;

import java.util.Scanner;

public class lef_rot_one {
    static void lef_rot_on(int[] arr, int n ){
        int temp = arr[0];
        for (int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int j = 0; j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        lef_rot_on(arr, arr.length);
    }
}
