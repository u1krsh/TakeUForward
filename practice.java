
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class practice {
    static void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        reverse(arr, 0, 2);
        reverse(arr,2+1, arr.length-1);
        reverse(arr, 0 , arr.length-1);

        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}