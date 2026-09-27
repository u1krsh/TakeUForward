package binary_search;
import java.util.Arrays;
import java.util.Scanner;

public class AggrCows {
    private boolean canWePlace(int[] arr, int dist, int cows){
        int cntCow = 1, coordinate = arr[0];
        for(int i =1; i< arr.length;i++){
            if(arr[i] - coordinate >= dist){
            cntCow++;
            coordinate = arr[i];
            }
        }
        return cntCow >= cows;
    }


    public int aggrCows(int[] arr, int cows){
        Arrays.sort(arr);
        int low = 0, high = arr[arr.length-1] - arr[0];
        int ans = -1;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(canWePlace(arr, mid, cows)){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        AggrCows solver = new AggrCows();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int cows = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sb.append(solver.aggrCows(arr, cows)).append('\n');
        }

        System.out.print(sb);
    }

}
