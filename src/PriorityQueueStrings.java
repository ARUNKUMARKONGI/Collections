import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueStrings {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparing(String::length).reversed());

        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Orange");
        priorityQueue.add("Grapes");

        System.out.println("Strings in Descending Order of Length:");
        while (!priorityQueue.isEmpty()) {
            String str = priorityQueue.poll();
            System.out.println(str);
        }
    }
}
