package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class stocks_buy_sell {
    static int stock(int[] arr){
        int prof =0, min = arr[0];
        for(int i =1;i<arr.length;i++){
            int cost = arr[i] - min;
            prof = Math.max(prof,cost);
            min = Math.min(min,arr[i]);
        }
        return prof;
    }

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println(stock(arr));
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}