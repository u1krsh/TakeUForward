package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class next_perm {
    static void reverse(int[] arr, int fromIndex, int toIndex) {
        if (arr == null || fromIndex >= toIndex || fromIndex < 0 || toIndex >= arr.length) {
            return;
        }

        int start = fromIndex;
        int end = toIndex;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }
    static int[] next_perm(int[] arr){
        int ind = -1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr,0,n-1);
            return arr;
        }
        for(int i = n-1;i>=ind;i--){
            if(arr[i] > arr[ind] ){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr,ind+1,n-1);
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,4,3,0,0};
        int[] result = next_perm(arr);
        System.out.println(Arrays.toString(result));
//        for(int k =0; k<arr.length;k++){
//            System.out.print(arr[k] + " ");
//        }
    }

}
