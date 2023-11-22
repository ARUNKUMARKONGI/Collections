import java.util.ArrayDeque;
import java.util.Queue;

public class Queueexample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Enqueue elements
        queue.offer(40);
        queue.offer(10);
        queue.offer(30);

        // Display the queue
        displayQueue(queue);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeue elements from the queue:");
        System.out.println(queue.poll());
        /*while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/
    }

    private static void displayQueue(Queue<Integer> queue) {
        System.out.print("Queue: ");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
