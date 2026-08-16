package binary_search;

public class bs {

    static int binary_sort(int[] arr, int t){
        int n = arr.length;
        int low = 0, high = n-1;
        int mid =0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] > t){
                high = mid-1;
            }
            else if(arr[mid] < t) {
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary_sort(arr,4));
    }
}
