package Arrays;

import java.util.Scanner;

public class check_arr_sorted {

    static boolean check_srt(int[] arr){
        for(int i = 1; i< arr.length; i++){
            if(arr[i]>= arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check_srt(arr));
    }
}
