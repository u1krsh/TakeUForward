package Arrays;


import java.util.*;


public class set_zer {
    static void setZeros(int[][] arr){
        int col0 =1;
        int n = arr.length;
        int m = arr[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j] ==0){
                    arr[i][0] = 0;
                    if( j!= 0){
                        arr[0][j] =0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        for( int i =1;i<n;i++){
            for(int j =1;j<n;j++){
                if(arr[i][j] !=0){
                    if(arr[i][0] ==0 || arr[0][j] ==0){
                        arr[i][j] =0;
                    }
                }
            }
        }

        if(arr[0][0] == 0){
            for(int j = 0;j<m;j++){
                arr[0][j] =0;
            }
        }

        if(col0 ==0){
            for(int i =0;i<n;i++){
                arr[i][0] = 0;
            }
        }


    }

    public static void main(String[] args) {

        int[][] arr = {{1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}};
        setZeros(arr);
        for(int k =0; k<arr.length;k++) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }

}