package Arrays;


import java.util.*;


public class sub_k_tot {
    static int sub_k(int[] arr, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int preSum = 0, cnt = 0;
        for(int i =0;i<arr.length;i++){
            preSum += arr[i];
            int rem = preSum-k;
            cnt += mpp.getOrDefault(rem,0);
            mpp.merge(preSum,1,Integer::sum);
        }
        return cnt;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(sub_k(arr,3));
////        for(int k =0; k<arr.length;k++) {
////            for (int l = 0; l < arr[0].length; l++) {
////                System.out.print(arr[k][l] + " ");
////            }
//            System.out.println();
//        }
    }

}
