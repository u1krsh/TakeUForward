package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class maj_ell {
    static int maj_el(int[] arr){
        int n = arr.length;
        int cnt =0, el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt =1;
                el = arr[i];
            }
            else if(arr[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;

        for(int i =0; i<n;i++){
            if(arr[i] == el) {
                cnt1++;
            }
        }
        if(cnt1 > n/2){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(maj_el(arr));
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}
