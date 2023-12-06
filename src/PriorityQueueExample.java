import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(20);
        pq.add(10);
        pq.add(1);
        pq.add(30);
        pq.add(5);
        pq.add(100);

        System.out.println("Elements in Priority Order:");
        while (!pq.isEmpty()) {
            int element = pq.poll();
            System.out.println(element);
        }
    }
}

//smallest element has the highest priority by default
//for strings, lexicographical order.
//PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparing(String::length).reversed());