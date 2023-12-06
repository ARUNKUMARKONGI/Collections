import java.util.PriorityQueue;
import java.util.Comparator;

class items {
    int value;
    int priority;

    public items(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityCustom {
    public static void main(String[] args) {
        PriorityQueue<items> pq = new PriorityQueue<>(Comparator.comparingInt(i-> i.priority));
        pq.add(new items(20, 3));
        pq.add(new items(10, 2));
        pq.add(new items(30, 1));
        pq.add(new items(50, 4));

        System.out.println("Values in Highest Priority Order:");
        while (!pq.isEmpty()) {
            items i = pq.poll();                //accesses the highest priority value first
            System.out.println("Value: " + i.value + " Priority: " + i.priority);
        }
    }
}
