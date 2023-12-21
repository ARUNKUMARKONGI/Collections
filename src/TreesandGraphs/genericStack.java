package TreesandGraphs;

import java.util.Arrays;
public class genericStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public genericStack() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(T element) {
        ensureCapacity();
        array[size++] = element;
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T del = (T) array[--size];
        array[size] = null;
        return del;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) array[size - 1];
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
 /*   public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }*/

    public static void main(String[] args) {
        genericStack<Integer> st = new genericStack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Size of the stack: " + st.size());
        System.out.println("Top element: " + st.peek());
        //st.display();
        System.out.println("Pop elements from the stack:");
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}

