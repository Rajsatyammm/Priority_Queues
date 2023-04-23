
// package PriorityQueue;
import java.util.*;

class Priority {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Priorityqueue obj = new Priorityqueue();
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 8));
        pq.add(new Student("c", 1));

        while (!pq.isEmpty()) {
            System.out.print(pq.remove().rank + " -> ");
        }
        System.out.println("null");
    }
}
