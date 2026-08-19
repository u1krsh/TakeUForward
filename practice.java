
import java.util.*;


public class practice {
    static int maxSubSum(int[] arr){
        int sum =0;
        int maxi = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0,0,0,2,2,1};
        System.out.println(maxSubSum(arr));
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }

}