package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class zer_on_two_arr {
    static void  dutch_nat(int[] arr){
        int n = arr.length;
        int low =0, mid =0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low ] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = arr[high];
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0,0,1,1,0,1,2,1,2,0,0,0,2};
        dutch_nat(arr);
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}