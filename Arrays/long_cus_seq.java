package Arrays;

import java.util.*;


public class long_cus_seq {
    static int longest_sub(int[] arr){
        int n = arr.length;
        HashSet<Integer> st = new HashSet<>();
        if(n==0){
            return 0;
        }

        for(int i =0;i<n;i++){
            st.add(arr[i]);
        }

        int longest = 1;
        for(int it: st){
            if(!st.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(st.contains(x+1)){
                    cnt += 1;
                    x+=1;
                }
                longest = Math.max(longest,cnt);

            }

        }
        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,4,3,0,0};
        System.out.println(longest_sub(arr));
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

}