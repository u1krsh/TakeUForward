package Sorting;
import java.util.Scanner;
public class quick_sort {

    static int f(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while( i <= high && arr[i]<pivot ){
                i++;
            }
            while(j >= low && arr[j]>pivot ){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    static void qs(int[] arr,int low,int high){
        if(low<high){
            int partin = f(arr,low,high);
            qs(arr,low,partin);
            qs(arr,partin+1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        qs(arr,0,arr.length-1);
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}
