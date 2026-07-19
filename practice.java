
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class practice {

    static void merge(int[] arr, int low, int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid;

        while(left <= mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right<=high){
            temp.add(arr[high]);
            right++;
        }

        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }

    static void ms(int[] arr, int low, int high){
        int mid = (low + high)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        for(int i = 1; i<=arr.length-1;i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}