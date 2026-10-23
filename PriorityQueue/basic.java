package Programming_abstraction.PriorityQueue;

import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
