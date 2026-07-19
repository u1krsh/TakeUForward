package Sorting;
import java.util.Scanner;
public class insetion_sort {
    static void ins_srt(int[] arr, int n){
        for (int i = 1; i<n; i++){
            int j = i;
            while(j> 0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
//                System.out.println(i+" "+j);
            }
        }
        for(int k =0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }



    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {14,9,15,12,6,8,13};
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        ins_srt(arr,arr.length);
    }
}
