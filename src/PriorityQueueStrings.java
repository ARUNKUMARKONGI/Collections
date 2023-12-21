import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueStrings {

    public static void main(String[] args) {
       // PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparing(String::length).reversed());
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Grietc");
        pq.add("Orange");
        pq.add("Apple");
        pq.add("banana");
        pq.add("Grapes");
        pq.add("grapes");
        pq.add("Abple");




       // System.out.println("Strings in Descending Order of Length:");
        while (!pq.isEmpty()) {
            String str = pq.poll();
            System.out.println(str);
        }
    }
}
