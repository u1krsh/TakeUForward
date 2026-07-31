package Arrays;


import java.util.*;


public class spiral {
    static void spi(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int left = 0;
        int right = m-1;
        int top =0;
        int bottom = n-1;
        List<Integer> ans = new ArrayList<>();

        while(top<=bottom && left <= right){
            for(int i = left; i<= right;i++){
                ans.add(arr[top][i]);
            }
            top++;

            for(int i = top; i<= bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;

            if(bottom>=top) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        spi(arr);
        for(int k =0; k<arr.length;k++) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }

}