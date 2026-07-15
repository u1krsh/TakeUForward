package Sorting;
import java.util.Scanner;
public class quick_sort {

    static int f(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j  = high;
        while (i<j){
            while(arr[i]<arr[pivot] && i <= high){
                i++;
            }
            while(arr[j] > arr[pivot] && j >=low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }


    static void qs(int[] arr, int low, int high){
        if(low<high){
            int partin = f(arr, low,high);
            qs(arr, low, partin-1);
            qs(arr, partin+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        qs(arr,arr[0],arr[n-1]);

    }
}
