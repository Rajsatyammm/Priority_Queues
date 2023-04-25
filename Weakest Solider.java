import java.util.*;

public class WeakestSolider {
    static class Info implements Comparable<Info> {
        int solider;
        int idx;

        Info(int soliders, int idx) {
            this.solider = soliders;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info i) {
            if (this.solider == i.solider) {
                return this.idx - i.idx;
            } else {
                return this.solider - i.solider;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };

        int k = 2;

        PriorityQueue<Info> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            pq.add(new Info(count, i));
        }

        for(int i=0; i<k; i++) {
            System.out.print("R"+pq.remove().idx + " ");
        }
    }
}
