package Arrays;

import java.util.Scanner;

public class second_largest {
    static int secon_lar(int[] arr, int n){
        int largest = arr[0];
        int S_largest = -1;

        for(int i = 1; i<n;i++){
            if(arr[i] > largest){
                S_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i]> S_largest){
                S_largest = arr[i];
            }
        }
        return S_largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secon_lar(arr, n));
    }
}
