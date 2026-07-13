package Sorting;
import java.util.Scanner;

public class selection_sort {
    static void sel_sort(int[] arr, int n){
        for(int i = 0; i < n-1; i++){
            int mini = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sel_sort(arr, n);
    }
}