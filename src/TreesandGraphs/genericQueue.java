package TreesandGraphs;

import java.util.Arrays;
public class genericQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public genericQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(T element) {
        ensureCapacity();
        rear = (rear + 1) % array.length;
        array[rear] = element;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removedElement = (T) array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return removedElement;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
    public void display() {
        System.out.print("Queue: ");
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(array[index] + " ");
            index = (index + 1) % array.length;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        genericQueue<Integer> queue = new genericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        queue.display();

        System.out.println("Dequeue elements from the queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}


