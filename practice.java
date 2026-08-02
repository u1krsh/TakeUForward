
import java.util.*;


public class practice {
        static void reverse(int[][] arr){
            int n = arr.length;
            for(int i = 0;i<n;i++){
                int left =0;
                int right = n-1;
                while(left < right){
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;
                    left ++;
                    right--;
                }
            }
        }


        static void rotate(int[][] arr){
            int n = arr.length;

            for(int i = 0; i <n-1;i++){
                for(int j = i+1;j<n;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            reverse(arr);
        }
    public static void main(String[] args) {

        int[][] arr = {{1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}};
        rotate(arr);
        for(int k =0; k<arr.length;k++) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }

}