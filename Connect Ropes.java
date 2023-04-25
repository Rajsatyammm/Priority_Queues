import java.util.*;
public class ConnectRopes {

    public static int minmCost(PriorityQueue<Integer> pq) {
        int max = 0;
        while(pq.size() != 1) {
            int fst = pq.remove();
            int scnd = pq.remove();
            max += fst+scnd;
            pq.add(fst + scnd);
        }
        return max;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[] = {4, 3, 2, 6};
        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }

        System.out.println(minmCost(pq));
    }
}
