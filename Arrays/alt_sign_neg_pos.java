package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class alt_sign_neg_pos {
    static void alt_sign(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int posIn = 0;
        int negIn = 1;
        for(int i =0;i<n;i++){
            if(arr[i] < 0){
                ans[negIn] = arr[i];
                negIn += 2;
            }
            else {
                ans[posIn] = arr[i];
                posIn += 2;
            }
        }

        for(int k =0; k<ans.length;k++){
            System.out.print(ans[k] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,1,-2,-5,2,-4};
        alt_sign(arr);
//        for(int k =0; k<arr.length;k++){
//            System.out.print(arr[k] + " ");
//        }
    }

}