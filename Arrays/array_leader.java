package Arrays;


import java.util.*;


public class array_leader {
    static void leader_arr(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for(int i = n-1;i>=0;i--){
            if(arr[i]>maxi){
                ans.add(arr[i]);
            }
            maxi  = Math.max(maxi,arr[i]);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,4,3,0,0};
        leader_arr(arr);
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}
