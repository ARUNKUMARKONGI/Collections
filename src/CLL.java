/* We can create our own collection framework in Java with the help of Oops concepts */

public class CLL<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public CLL() {
        this.head = null;
        this.size = 0;
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular link to itself
        } else {
            Node<E> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Make the new node point to the head
        }
        size++;
    }
    public void remove(E value) {
        if (head == null) {
            return;                                   // List is empty, nothing to remove
        }

        if (head.data.equals(value)) {               //if we are deleting first node
            if (size == 1) {
                head = null;                         // Remove the only node in the list
            } else {
                Node<E> temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;                // Update the last node's next pointer
                head = head.next;                     // Update the head to the next node
            }
            size--;
            return;
        }

        Node<E> cur = head;
        Node<E> prev = null;

        do {                                            //if we are deleting any other node
            if (cur.data.equals(value)) {
                prev.next = cur.next;    // Remove the current node
                size--;
                return;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != null && cur != head);
    }


    public void display() {
        Node<E> temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != null && temp != head);
        }
        System.out.println();
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CLL<Integer> cll = new CLL<>();
        cll.add(3);
        cll.add(5);
        cll.add(7);
        cll.add(6);

        System.out.println("Circular Linked List:");
        cll.display();
        System.out.println("Size: " + cll.size());

        // Reverse the circular linked list using recursion

        cll.remove(6);

        System.out.println("Linked List after removal of node with value 6:");
        cll.display();
        System.out.println("Size: " + cll.size());
    }
}



    /*public boolean search(E value) {
        Node<E> temp = head;
        do {
            if (temp.data.equals(value)) {
                return true; // Value found
            }
            temp = temp.next;
        } while (temp != head);
        return false; // Value not found
    }
    int searchValue = 3;
    boolean found = circularList.search(searchValue);
        System.out.println("Is " + searchValue + " present? " + found);*/