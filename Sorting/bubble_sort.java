package Sorting;
import java.util.Scanner;
public class bubble_sort
{
    static void bbl_srt(int[] arr, int n){

        for(int i = n-1;i>=0;i--){
            int didswap = 0;
            for(int j =0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap = 1;
                }
            }if(didswap==0){
                break;
            }
        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        bbl_srt(arr,n);
    }
}
