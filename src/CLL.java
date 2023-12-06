/*
Implement a Generic CLL (circular linked list) in java using oops concepts.

Test cases:
--------------
input=1 20 1 40 1 50 1 30
3
2 40
3
1
100
3
4
output=
Circular Linked List:
20 40 50 30
Size: 4
Element removed successfully!
Circular Linked List:
20 50 30
Size: 3
Circular Linked List:
20 50 30 100
Size: 4
*/
//write your code below


/* We can create our own collection framework in Java with the help of Oops concepts */
/*
Implement a Generic CLL (circular linked list) in java using oops concepts.

Test cases:
--------------
input=1 20 1 40 1 50 1 30
3
2 40
3
1
100
3
4
output=
Circular Linked List:
20 40 50 30
Size: 4
Element removed successfully!
Circular Linked List:
20 50 30
Size: 3
Circular Linked List:
20 50 30 100
Size: 4
*/
//write your code below


/* We can create our own collection framework in Java with the help of Oops concepts */
import java.util.*;
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
        if (size >= 4) {
            System.out.println("CLL is full.");
            return;
        }
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
    public boolean remove(E value) {
        if (head == null) {
            System.out.println("CLL is empty. can't remove.");
            return false;
        }
        boolean flag=false;
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
            flag=true;
        }

        Node<E> cur = head;
        Node<E> prev = null;

        do {                                            //if we are deleting any other node
            if (cur.data.equals(value)) {
                prev.next = cur.next;                  // Remove the current node
                size--;
                flag=true;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != null && cur != head);

        return flag;
    }

    public void display() {
        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }
        System.out.println("CLL elements are:");
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


    public boolean search(E value) {
        Node<E> temp = head;
        do {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public static void main(String[] args) {
        CLL<Integer> cll = new CLL<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true)
        {
                /*
                System.out.println("1. Add Element");
                System.out.println("2. Remove Element");
                System.out.println("3. Display Elements");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
*/
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    //System.out.print("Enter the element to add: ");
                    int item = sc.nextInt();
                    cll.add(item);
                    break;
                case 2:
                    // System.out.print("Enter the element to remove: ");
                    int re = sc.nextInt();
                    boolean flag=cll.remove(re);
                    if(flag)
                        System.out.println("Element removed successfully");
                    else
                        System.out.println("Node Doesn't exist in CLL");
                    break;
                case 3:
                    cll.display();
                    System.out.println("Size: " + cll.size());
                    break;

                case 4:  int search =sc.nextInt();
                    boolean found = cll.search(search);
                    System.out.println("Is " + search + " present? " + found);

                case 5:
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice..");
            }
        }
    }
}


