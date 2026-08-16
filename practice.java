
import java.util.*;


public class practice {
    static int[][] merge_overlap(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b) ->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1)[0]){
                ans.add(arr[i]);
            }
            else{
                ans.get(ans.size()-1)[0] = Math.max(ans.get(ans.size()-1)[1], arr[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {

        int[] arr = {-2,-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
//        System.out.println(three_sum(arr));
////        for(int k =0; k<arr.length;k++) {
////            for (int l = 0; l < arr[0].length; l++) {
////                System.out.print(arr[k][l] + " ");
////            }
//            System.out.println();
//        }
    }

}