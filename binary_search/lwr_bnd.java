package binary_search;

public class lwr_bnd {
    static int lower_bound(int[] arr, int t){
        int n = arr.length;
        int low = 0,  high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= t){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,7,8,9,9,9,11};
        System.out.println(lower_bound(arr,6));
    }
}
