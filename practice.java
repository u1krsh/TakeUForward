
import java.util.*;


public class practice {
    static int redArr (List<Integer> sus){
        int n = sus.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x:sus){
            pq.add(x);
        }
        while(pq.size() > 1){
            int min1 = pq.peek(); pq.remove();
            int min2 = pq.peek(); pq.remove();
            pq.add(Math.abs(min1-min2));
        }
        return pq.peek();
    }



    public static void main(String[] args) {
        List<Integer> sus = new ArrayList<>();
        sus.add(5);
        sus.add(4);
        sus.add(9);
        sus.add(2);
        sus.add(1);
        sus.add(3);
        System.out.println(redArr(sus));
    }

}